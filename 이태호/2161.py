n = int(input())
card = [i for i in range(1,n+1)] # 입력받은 숫자 기반 리스트 생성
wasted_card = [] # 버리는 카드 담을 리스트 


while len(card) != 1: # 마지막 1장남을 때까지
    wasted_card.append(card.pop(0)) # 맨위에 거 바닥에 버리기
    card.append(card[0]) # 그다음 맨위에 거 맨 밑으로 복사해서 넣기
    del card[0] # 맨위에 거 밑으로 넣을 때 복사해서 넣었으니 제거


for j in wasted_card: # 출력 #
    print(j ,end=' ')
print(card[0])

