a = [i for i in range(10001)] # 0~ 100000까지 초기화
b = a.copy() # b배열 a로부터 깊은 복사


for i in a: # a의 모든 값 순회
    check = 0 # 확인할 값을 담기위한 변수 선언
    check += i # 확인할 값을 계산하는 과정 중 첫번 째 -> 그 값 자체를 check 더하는 과정
    str_i = str(i)  # 그 값의 각 자릿수를 더하기 위해 새로운 변수 선언(i의 문자열 형) -> ex) 123이라고하면 이 123을 문자열'123'로 변환
    for j in range(len(str_i)):
        check += int(str_i[j]) # 문자열로 변환한 그 값의 각 자릿수를 check값에 더하는 과정 -> ex) 123의 1, 2, 3 더하기

    if check in b: # 확인할 check값이 b리스트에 있다면 b의 리스트에서 check값 빼기 -> 생성자가 있는 숫자는 제외
        b.remove(check)

for k in b: # b배열에 남아있는 값들은 결국 생성자가 없는 애들 -> 그대로 출력
    print(k)
