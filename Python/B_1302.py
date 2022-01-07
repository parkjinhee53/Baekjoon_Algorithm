"""
오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램
"""

n = int(input("")) # 하루 동안 팔린 책의 개수 입력받기
dic = {} # 빈 dictionary 생성
b_list = [] # 빈 리스트 생성

for i in range(n): # 0부터 n보다 1 작을 때까지 반복
  key = input() # 책(key) 제목 입력받기
  if key in dic: # key가 원래 dictionary 안에 있으면 
    dic[key] += 1 # key 값 1 증가시키기
  else: # 그렇지 않으면
    dic[key] = 1 # 새로운 key가 하나 생김

for key, value in dic.items(): # key과 value를 한번에 반복하기 위해 items()사용
  if value == max(dic.values()): # 가장 큰 value 값이 value랑 같으면
    b_list.append(key) # 리스트에 책 추가

print(sorted(b_list)[0]) # sorted()를 이용하여 리스트 정렬하고 첫 번째 원소 출력 