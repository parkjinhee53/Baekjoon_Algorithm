"""
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
"""

n = int(input("")) # n 입력받기

for i in range(1,n+1): # 1부터 n까지 반복
    print("*"*i) # * 출력