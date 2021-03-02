# num = int(input())
# list = input().split()
# x = 1 
# y = 1
# for order in list : 
#     if order == 'U' :
#         if(x-1>=1):
#             x -= 1
#     if order == 'D' :
#         if(x+1<=5):
#             x += 1
#     if order == 'L' :
#         if(y-1>=1):
#             y -= 1
#     if order == 'R' :
#         if(y+1<=5):
#             y += 1
# print(x, y)

n = int(input())
plans = input().split()
x, y = 1, 1 
dx = [ 0, 0, -1, 1]
dy = [ -1, 1, 0, 0]
move_type = [ 'L', 'R', 'U', 'D']

for plan in plans :
    for i in range(len(move_type)) :
        if plan == move_type[i] :
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or ny < 1 or nx > n or ny > n :
        continue
    x, y = nx, ny 

print(x, y)




