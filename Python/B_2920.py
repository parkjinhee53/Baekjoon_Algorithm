"""
연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램
"""

a = list(map(int, input().split(" "))) # 음계 입력받기

if a == [1, 2, 3, 4, 5, 6, 7, 8]:
  print("ascending")
elif a== [8, 7, 6, 5, 4, 3, 2, 1]:
  print("descending")
else:
  print("mixed")