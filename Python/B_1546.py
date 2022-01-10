"""
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램
"""

n = int(input()) # 개수 입력받기
a = list(map(int, input().split(" "))) # 입력받은 점수 저장할 리스트
sum = 0 # 점수 합계 저장할 변수

m = max(a) # 최고점 구하기

for i in range(n):
  sum += a[i] / m * 100 # 처음에 입력받은 점수 고치고 sum에 저장
print(sum/n) # 평균 출력