change = int(input())
money = [ 500, 100, 50, 10]
sum = 0
for m in money:
    sum += change // m
    change %= m

print(sum)