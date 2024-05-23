n, m= map(int,input().split())

n_list = []

for i in range(n) :
    n_list.append(i+1)

for i in range(m) :
    x, y= map(int,input().split())
    temp = n_list[x-1]
    n_list[x-1] = n_list[y-1]
    n_list[y-1] = temp

print(*n_list)
