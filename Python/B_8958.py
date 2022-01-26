"""
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램
"""

n = int(input()) # 테스트 케이스의 개수 입력받기

for i in range(n): # 입력받은 개수만큼 반복
  a = list(input()) # 문자열인 O와 X 입력받아서 a 리스트에 추가
  sum = 0 # 점수를 저장할 변수
  count = 0 # 누적된 점수 저장할 변수
  for j in a:
    if j == 'O': # O가 있다면
      count += 1
      sum += count # sum에 누적된 점수 더해주기 
    else:
      count = 0
  print(sum) # 점수 출력   