"""
학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력
"""

n = int(input("")) # 전체 사람의 수 입력받기
n_list = [] # 키와 몸무게를 저장할 리스트 생성

for i in range(n): # 전체 사람의 수만큼 반복
  x, y = map(int,input().split()) # 몸무게와 키 입력받기
  n_list.append((x, y)) # 입력받은 몸무게와 키 리스트에 추가

# 반복문과 조건문으로 덩치 등수 구하기
for i in n_list: 
  rank = 1 # 등수을 저장할 rank를 1로 초기화
  for j in n_list:
    if i[0] < j[0] and i[1] < j[1]: # 자신보다 덩치가 더 크면 
      rank +=1 # 조건이 충족하면 등수에 1 더하기
  print(rank, end=" ") # 덩치 등수 출력