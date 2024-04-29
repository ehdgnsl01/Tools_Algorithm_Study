n = int(input())

name = n//4
long_list = []

for i in range(name):
    long_list.append("long")

print(*long_list, "int")