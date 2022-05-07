// 숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램

var arr = (readLine()?.split(separator: " ").map{ Int($0)!})!

arr.sort()

print("\(arr[0]) \(arr[1]) \(arr[2])")
