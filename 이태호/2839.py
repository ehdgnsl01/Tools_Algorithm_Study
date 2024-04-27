sum_kg = int(input()) # 전체 설탕무게 입력받기
i = 0 # for문을 돌리기 위한 변수
count = [] # 봉지 개수를 담을 리스트

# 5kg 봉지를 0개부터 1개씩 늘려가며 나머지를  3kg 봉지로 채울 수 있는지 확인

for i in range(0, sum_kg // 5 + 1): # 5kg 봉지의 최대 개수를 구하기 위한 for문
    if (sum_kg - 5 * i) % 3 == 0:
        count.append(i + (sum_kg - 5 * i) / 3) # 5kg 봉지 개수와 3kg 봉지 개수를 더한 값을 count 리스트에 추가, 즉 5kg 봉지와 3kg 봉지로 구현 가능한 경우.


print(int(min(count)) if count else -1) # count 리스트에 값이 없다면 -1을 출력, 있다면 count 리스트의 최솟값을 출력
