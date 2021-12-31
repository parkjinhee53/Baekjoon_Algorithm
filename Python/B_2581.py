"""
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램
"""

m = int(input("")) # 자연수 입력받기
n = int(input("")) # 자연수 입력받기
list = [] # 소수를 저장할 리스트 생성

for i in range(m, n+1): # m부터 n까지 반복
  count = 0 # 소수면 1를 더할 count 0으로 초기화
  if i != 1: # 1이 아니면
    for j in range(2, i): # 2부터 i-1까지 반복
      if i % j == 0: # 나머지가 0이면
        count += 1 # count에 1 더하기
        break # 반복문 탈출
    if count == 0: # count가 0이면
      list.append(i) # 소수를 저장할 리스트에 추가하기

if len(list) > 0: # 리스트 길이가 0보다 크면
  print(sum(list)) # 리스트 합 출력
  print(min(list)) # 리스트 최솟값 출력
else: # 그렇지 않으면
  print(-1) # -1 출력     