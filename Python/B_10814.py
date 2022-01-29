"""
회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램
"""

n = int(input("")) # 온라인 저지 회원의 수 입력받기
n_list = [] # 나이와 이름을 저장할 리스트 생성

for i in range(n): # 온라인 저지 회원의 수만큼 반복
  age, name = map(str,input().split()) # 나이와 이름 입력받기
  age = int(age) # 문자열로 입력받은 나이 정수로 바꾸기
  n_list.append((age, name)) # 리스트에 나이와 이름 추가
n_list.sort(key = lambda a: a[0]) # lambda 사용해서 정렬
for a in n_list: # 나이와 이름을 저장한 리스트에서 반복
  print(a[0], a[1]) #  나이 순으로 출력(나이가 같으면 가입한 순으로 출력) 