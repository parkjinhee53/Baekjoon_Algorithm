// 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램

let n = Int(readLine()!)!
var arr: [(Int, Int)] = []

for i in 0..<n {
    let a = readLine()!.split(separator: " ").map{ Int($0)! }
    arr.append((a[0], a[1]))
}

arr.sort(by: {
    $0.1 == $1.1 ? $0.0 < $1.0 : $0.1 < $1.1
})

for i in 0..<n {
    print("\(arr[i].0) \(arr[i].1)")
}
