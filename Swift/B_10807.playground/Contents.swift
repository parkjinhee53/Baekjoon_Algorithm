// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램

let n = Int(readLine()!)!
let arr = (readLine()?.split(separator: " ").map{ Int($0)!})!
let v = Int(readLine()!)!
var count = 0

for i in 0...arr.count-1 {
    if(arr[i] == v) {
        count += 1
    }
}

print(count)
