// 초콜릿의 크기가 주어졌을 때, 이를 1×1 크기의 초콜릿으로 쪼개기 위한 최소 쪼개기 횟수를 구하는 프로그램

// 두 정수 n, m 입력받기
var arr = readLine()!.split(separator: " ")
var n = Int(arr[0])!
var m = Int(arr[1])!

print(n * m - 1) // 최소 쪼개기 횟수
