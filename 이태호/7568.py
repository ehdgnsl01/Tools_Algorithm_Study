info =[list(map(int, input().split())) for _ in range(int(input()))]


for i in range(len(info)): 
    rank = 1
    for j in range(len(info)):
        if info[i][0] < info[j][0] and info[i][1] < info[j][1]: # 내가 뒤쳐질때마다 rank가 증가
            rank += 1
    
    print(rank)
            
    




