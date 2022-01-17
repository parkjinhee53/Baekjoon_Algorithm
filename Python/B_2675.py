"""
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램
"""

n = int(input("")) # 테스트 케이스의 개수 입력받기

for i in range(n): # n까지 반복
  a, b = input().split() # 각 테스트 케이스는 반복 횟수 a와 문자열 b 입력받기 
  a = int(a) # 정수로 바꾸기

  for j in b: # b에서 반복
     print(j*a, end="") # a만큼 반복하여 출력
  print() # 줄 바꾸기