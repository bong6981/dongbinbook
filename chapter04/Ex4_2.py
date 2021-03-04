# position = input()
# x = ord(position[0])
# y = int(position[1])
# ##countA = 수평먼저
# ##countB = 수직 먼저

# countAx = 0
# countBx = 0

# if ord('a') <= x-1 <= ord('h') :
#    countBx += 1
#    if ord('a') <= x-2 <= ord('h') :
#        countAx += 1

# if ord('a') <= x+1 <= ord('h') :
#    countBx += 1
#    if ord('a') <= x+2 <= ord('h') :
#        countAx += 1

# countAy = 0
# countBy = 0

# if 1 <= y-1 <= 8 :
#    countAy += 1
#    if 1 <= y-2 <= 8 :
#        countBy += 1

# if 1 <= y+1 <= 8 :
#    countAy += 1
#    if 1 <= x+2 <= 8 :
#        countBy += 1

# result = (countAx * countAy) + (countBx + countBy)
# print(result)

input_data = input()
row = int(input_data[1])
column = int(ord(input_data[0])) - int(ord('a')) + 1 

steps = [(-2, -1), (-1,-2), (1,-2), (2,-1), (2,1), (1,2), (-1,2), (-2,1) ]
result = 0
for step in steps:
    next_row = row + step[0]
    newx_column = column + step[1]
    if  1 <= next_row <= 8 and 1<= newx_column <= 8:
        result += 1
print(result)
