// 세 정수 A, B, C가 주어졌을 때, 두 번째로 큰 정수를 출력하는 프로그램

var arr = (readLine()?.split(separator: " ").map{ Int($0)!})!

arr.sort()

print(arr[1])
