"""
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
"""

while True: # 무한루프
  a, b = map(int, input().split(" ")) # a,b 입력받기
  if (a == 0 and b == 0): # a,b 0이면
    break; # 반복문 나가기
  else:
    print(a+b) 