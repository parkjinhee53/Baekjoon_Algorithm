"""
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램
"""

def gcd(x,y):
    """
    유클리드 호제법 사용하여 최대공약수 구하기
    x,y: 두 정수
    """
    if y == 0: # y가 0이면
        return x # 반환값은 a
    else: # 그렇지 않으면
        return gcd(y,x%y) # 반환값은 y와 x,y를 나눈 나머지

def lcm(i,j):
    """
    유클리드 호제법으로 최소공배수 구하기
    i,j: 두 정수
    """
    return (i*j) // gcd(i,j) # 반환값

# 프로그램 시작
a, b = map(int, input().split()) # 두 정수 입력받기
print(gcd(a,b)) # 최대공약수 출력
print(lcm(a,b)) # 최소공배수 출력