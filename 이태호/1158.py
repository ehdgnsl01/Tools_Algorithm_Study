N, K = map(int, input().split())
a = [ i for i in range(1,N+1)]

removed_a = [] # 제거된 사람을 담을 리스트
idx = 0

for i in range(N):
    idx =  (idx + K -1) % len(a) # 인덱스 관리
    removed_a.append(str(a.pop(idx)))

print('<' + ', '.join(removed_a) + '>\n') # 출력
