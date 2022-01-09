"""
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램
"""

A, B = map(int, input().split(" ")) # 두 정수 A와 B 입력받기

if(A > B): # A가 B보다 크다면
  print(">")
elif(A == B): # A와 B가 같다면
  print("==")
else: # 그렇지 않으면
  print("<")