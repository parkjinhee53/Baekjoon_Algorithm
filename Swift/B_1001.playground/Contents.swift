// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램 

import Foundation

var arr: [String]
var a = readLine()!

arr = a.components(separatedBy: " ")

print(Int(arr[0])! + Int(arr[1])!)
