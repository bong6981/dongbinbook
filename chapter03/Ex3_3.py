n, m = map(int, input().split(" "))





#  내가 푼 방법 
# for i in range(n-1) : 
#     data = list(map(int, input().split(" ")))
#     data.sort()
#     if(data[0] > min):
#         min = data[0]
        

# print(min)

result = 0

for i in range(n):
    data = list(map(int, input().split()))
    min_value = min(data)
    result = max(result, min_value)

print(result)
