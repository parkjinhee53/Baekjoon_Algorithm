// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램

import Foundation

var arr: [String]
var a = readLine()!

arr = a.components(separatedBy: " ")

print(Int(arr[0])! + Int(arr[1])!)
print(Int(arr[0])! - Int(arr[1])!)
print(Int(arr[0])! * Int(arr[1])!)
print(Int(arr[0])! / Int(arr[1])!)
print(Int(arr[0])! % Int(arr[1])!)
