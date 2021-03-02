n, k = map(int, input().split())

count = 0; 

while(n!=1) :
    count += n % k
    n -= n % k
    n = n // k 
    count += 1


print(count)