"""
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램
"""

a = [] # 빈 리스트 정의
for i in range(9): # 9번 반복
  a.append(int(input())) # 입력받은거 a 리스트에 추가
print(max(a)) # 최댓값 출력
print(a.index(max(a))+1) # 최댓값이 몇 번째 인수인지 출력(인덱스는 0부터 시작하기 때문에 1 더해줌)