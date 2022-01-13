"""
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력
"""

n = int(input("")) # n 입력받기

for i in range(1, n+1): # 1부터 n까지 반복
    print("*"*i + (n-i)*2*' ' + '*'*i) # * 출력
    
for j in range(n-1,0,-1): # n-1부터 거꾸로 1까지 반복
    print('*'*j + (n-j)*2*' ' + '*'*j) # * 출력