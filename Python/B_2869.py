"""
달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램 
"""
import math

a,b,v = map(int,input().split())
d = math.ceil((v - b) / (a - b))
print(d)