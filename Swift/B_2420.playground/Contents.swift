// 두 서브도메인의 유명도가 주어졌을 때, 그 차이를 구하는 프로그램

let arr = readLine()!.split(separator: " ").map { Int($0)! }

var n = arr[0]
var m = arr[1]

var s = abs(n - m)

print(s)
