// TV의 대각선 길이와, 높이 너비의 비율이 주어졌을 때, 실제 높이와 너비의 길이를 출력하는 프로그램

import Foundation

let arr = readLine()!.split(separator: " ").map { Double(String($0))! }
let a = pow(pow(arr[0], 2) / (pow(arr[1], 2) + pow(arr[2], 2)), 0.5)

print(Int(floor(a * arr[1])), Int(floor(a * arr[2])))
