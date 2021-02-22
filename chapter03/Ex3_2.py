n, m, k = map(int, input().split())
inputArray = list(map(int, input().split()))

inputArray.sort()

first = inputArray[n-1]
second = inputArray[n-2]

num_f = int(m / (k+1)) * k
num_f += m % (k+1)

sum = 0
sum += num_f * first 
sum += second * (m//(k+1))

print(sum)