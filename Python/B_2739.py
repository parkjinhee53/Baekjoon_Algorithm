"""
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램
"""

n = int(input("")) # n 입력받기

for i in range(1,10): # 1부터 9까지 반복
  print("%d * %d = %d"%(n,i,n*i)) # 구구단 출력