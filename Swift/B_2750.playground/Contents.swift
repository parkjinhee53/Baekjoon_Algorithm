// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램

let n = Int(readLine()!)!
var arr: [Int] = []

for _ in 1...n {
    arr.append(Int(readLine()!)!)
}

arr.sort()

for i in 0..<n {
    print("\(arr[i])")
}
