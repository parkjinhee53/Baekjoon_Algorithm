//세 대각선이 한 점에서 만나지 않는 볼록 N각형이 주어졌을 때, 대각선의 교차점의 개수를 세는 프로그램

let n = Int(readLine()!)!

print((n * (n - 1) * (n - 2) * (n - 3)) / 24)
