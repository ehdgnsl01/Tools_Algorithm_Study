s = list(map(int,input())) # 리스트 입력받기

toggle = 0 # 1-> 0 OR 0 -> 1로 toggle 되는 횟수 계산


# 리스트에서 i값과 그 다음값이 같은지 확인
# 만약 같다면 이어서 킵고잉
# 만약 다르다면 toggle 횟수 1 추가
# 만약 i가 리스트의 끝부분에 있다면 반복문 종료

for index, value in enumerate(s):
    if index + 1 == len(s): break 

    if value == s[index+1]:
        continue
    else:
        toggle+=1
    
# toggle의 횟수가 짝수라면 2로 나눈 int형 출력
# toggle의 횟수가 홀수라면 2로 나누고 + 1 출력
if toggle % 2 == 0:
    print(toggle//2)
else:
    print( toggle //2 + 1)


