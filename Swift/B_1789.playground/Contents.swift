// 서로 다른 N개의 자연수의 합 S를 알 때, 자연수 N의 최댓값은 얼마인지 구하는 프로그램

let s = Int(readLine()!)!

var n = 0

repeat {
    n += 1
} while s >= n * (n + 1) / 2 // 등차수열의 합 공식 

print(n - 1)
