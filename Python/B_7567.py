"""
입력에 주어진 모양대로 그릇을 쌓을 때 최종의 전체 그릇 높이를 계산해서 출력
"""

dish = list(str(input())) # 괄호 입력받기(그릇)
h = 10 # 그릇을 바닥에 놓았을 때 높이가 10이기 때문에 10으로 초기화ㅂ

for i in range(1, len(dish)):
    if dish[i] == dish[i-1]: # 서로 같은 방향으로 쌓이면 높이 5 증가
        h += 5
    else: # 서로 반대 방향으로 쌓이면 높이 10 증가
        h += 10
print(h)