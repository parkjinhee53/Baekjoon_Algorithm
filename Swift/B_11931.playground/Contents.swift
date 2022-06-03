// N개의 수가 주어졌을 때, 이를 내림차순으로 정렬하는 프로그램

let n = Int(readLine()!)!
var arr:[Int] = []

for _ in 0..<n {
    arr.append(Int(readLine()!)!)
}

arr.sort(by: >) // 내림차순

for i in arr {
    print(i)
}

