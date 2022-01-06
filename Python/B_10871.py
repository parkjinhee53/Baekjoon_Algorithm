"""
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램
"""

n, x = map(int, input().split(" ")) # 정수 개수인 n과 정수 x를 한 줄에 입력받기
a = list(map(int, input().split(" "))) # 한 줄에 여러개의 정수를 입력받아서 정수 리스트로 만들어 a에 저장

for i in range(n): # n까지 반복
  if a[i] < x: # a 안에 있는 각각의 정수들이 x보다 작다면
    print(a[i], end=" ") # x보다 작은 정수 출력