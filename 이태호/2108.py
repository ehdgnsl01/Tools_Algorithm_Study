import sys

N = int(sys.stdin.readline().rstrip())
num = [int(sys.stdin.readline().rstrip()) for _ in range(N)]

num.sort()
total = sum(num)

temp = {}
for i in num:
    if i in temp:
        temp[i] += 1
    else:
        temp[i] = 1

max_value = max(temp.values())
numbers = [key for key, value in temp.items() if value == max_value]

if len(numbers) == 1:
    frequent = numbers[0]
else:
    frequent = sorted(numbers)[1]

mean = round(total / N + 0.000001)
median = num[(N - 1) // 2]
rrange = num[-1] - num[0]

print(mean)
print(median)
print(frequent)
print(rrange)
