// 두 수를 나누었을 때, 소숫점 아래 N번째 자리수를 구하는 프로그램

var num = readLine()!.split(separator: " ").map{Int($0)!}
var a = num[0]
var b = num[1]
var n = num[2]

var r = a % b

for _ in 0..<n-1 {
    r *= 10
    r %= b
}
r *= 10

print(r/b)
