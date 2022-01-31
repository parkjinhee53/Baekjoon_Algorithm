"""
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램
"""

n = int(input()) # 숫자의 개수 입력받기
a = list(input()) # 숫자 입력받기
sum = 0 # 합을 저장할 변수

for i in a: # a만큼 반복
  sum += int(i) # 합 저장하기
print(sum) # 합 출력  