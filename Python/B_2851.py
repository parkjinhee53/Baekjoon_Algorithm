"""
버섯의 점수가 주어졌을 때, 마리오가 받는 점수를 출력하는 프로그램
"""

m_list = [] # 버섯의 점수를 나열할 빈 리스트 생성
score = 0 # 마리오가 받는 점수를 저장할 변수 score를 0으로 초기화

for i in range(10): # 10개의 점수를 입력받기 위해 반복문 사용
  m_list.append(int(input())) # 버섯 점수 입력받아 m_list에 추가

for j in m_list: # 버섯의 점수 리스트 안에서 반복
  score += j # 마리오가 받는 점수 구하기
  if score >= 100: # 점수가 100보다 크거나 같으면
    if score - 100 > 100 - (score - j): # score와 100의 차이 값이 이전의 score와 100의 차이보다 크다면
      score -= j # 조건이 맞다면 이전의 score 값이 100이랑 더 가깝기 때문에 score를 이전의 score 값으로 바꿔줌
      break # 반복문 탈출

print(score) # score 출력