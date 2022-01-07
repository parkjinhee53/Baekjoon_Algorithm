"""
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
"""

w = input().upper() # 단어 입력받고 대문자로 바꾸기
a = list(set(w)) # 중복값 제거
c = [] # 알파벳 개수 저장할 리스트

for i in a: 
  c.append(w.count(i)) # 알파벳 개수 세서 c 리스트에 저장

if c.count(max(c)) > 1: # 가장 큰 값이 여러 개가 있다면
  print("?")
else:
  print(a[c.index(max(c))]) # 가장 큰 값에 해당하는 알파벳 출력