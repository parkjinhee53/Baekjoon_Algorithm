"""
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램
"""

a = int(input("")) # 자연수 입력받기
b = int(input("")) # 자연수 입력받기
c = int(input("")) # 자연수 입력받기
count = 0 # 0부터 9까지 숫자가 각각 몇 번 쓰였는지 횟수를 저장할 count를 0으로 초기화
n = a * b * c # 세 개의 자연수 a,b,c 곱하기
n_list = list(str(n)) # n을 문자열로 바꿔주고 리스트 생성

for i in range(10): # 9까지 반복
  for j in range(len(n_list)): # 리스트 길이만큼 반복
    if n_list[j] == str(i): # n_list의 j번째 요소가 i와 같다면
      count += 1 # 조건이 충족하면 count에 1 더하기
  print(count) # 횟수 출력
  count = 0 # 0으로 초기화