coin_num, value = map(int, input().split())
coin = []
count = 0

for i in range(coin_num): # 동전의 가치들을 배열에 저장
    temp = int(input())
    coin.append(temp)

for i in range(-1,-len(coin)-1,-1): # 그리디 방식으로 가치가 큰 애들부터 비교
    
    if value // coin[i] >= 1: # 선택된 동전을 거슬러줄 수 있는 경우라면
        count += value // coin[i] # 그 동전을 최대로 줄 수 있는 만큼 주고
        value = value - coin[i]*(value // coin[i]) # 그 동전으로 거슬러주고 남은 값으로 다시 초기화

print(count)




