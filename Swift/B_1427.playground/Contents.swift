// 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬

let n = readLine()!
var arr: [Int] = []

for i in n {
    arr.append(Int(String(i))!)
}
arr.sort(by: >) // 내림차순 정렬

for i in 0..<arr.count {
    print("\(arr[i])", terminator: "")
}
