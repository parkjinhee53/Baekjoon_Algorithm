"""
N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램
"""

n, m = map(int,input().split()) # A의 크기 n,m 입력받기
a = [] # 행렬 A의 원소를 저장할 리스트 생성
for i in range(n): # n까지 반복하여 a의 원소 입력받기
  a.append(list(map(int,input().split()))) # a 리스트에 요소 추가

m, k = map(int,input().split()) # B의 크기 m,k 입력받기
b = [] # 행렬 B의 원소를 저장할 리스트 생성
for j in range(m): # m까지 반복하여 b의 원소 입력받기
  b.append(list(map(int,input().split()))) # b 리스트에 요소 추가

result = 0 # 두 행렬을 곱한 값 저장할 변수 0으로 초기화
# 두 행렬을 곱하기 위해 반복문 사용
for h in range(n): 
  for g in range(k):
    for f in range(m):
      result += a[h][f]*b[f][g]
    print(result, end=" ") # 두 행렬을 곱한 값 출력
    result = 0 # 새로운 값을 저장해야 하기 때문에 다시 0으로 초기화
  print("") # A와 B를 곱한 행렬을 출력