"""
각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력
"""

t = int(input()) 

for i in range(t):
  h, w, n = map(int, input().split())
  f = n % h
  r = n // h + 1
  if f == 0:
     r -= 1
     f = h

  print(f*100 + r) 