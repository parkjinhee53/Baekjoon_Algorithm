"""
학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램
"""

sum = 0

for i in range(5):
    score = int(input(""))
    if score < 40: # 40점 미만이면 40 더하기
        sum += 40
    else:
        sum += score
print(int(sum/5))  