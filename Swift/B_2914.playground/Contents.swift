// 적어도 몇 곡이 저작권이 있는 멜로디인지 구하는 프로그램 

var arr = readLine()!.split(separator: " ").map { Int($0)! }
var a = arr[0]
var i = arr[1]

print(a * (i - 1) + 1)
