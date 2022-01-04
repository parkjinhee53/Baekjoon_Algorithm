"""
타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램
"""

money = int(input("")) # 돈 입력받기
change = 1000 - money # 거스름돈
c_list = [500,100,50,10,5,1] # JOI잡화점에는 잔돈 리스트에 저장
count = 0 # 동전 개수 저장할 count를 0으로 초기화

for c in c_list:
  if(change >= c):
    m = change // c # 몫 구하기
    change -= m * c # 몫과 곱한 값 빼기
    count += m # 동전 개수 카운트하기
print(count) # 동전 개수 출력