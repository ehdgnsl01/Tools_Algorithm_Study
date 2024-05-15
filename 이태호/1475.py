import math
room_num = list(map(int,input()))
num_num = []

for i in range(9):
    if i == 6:
        num_num.append(math.ceil((room_num.count(6) + room_num.count(9)) / 2))
    else: num_num.append(room_num.count(i))

print(max(num_num))

