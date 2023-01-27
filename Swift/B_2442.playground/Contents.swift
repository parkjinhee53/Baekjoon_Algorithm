// 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제 

let n = Int(readLine()!)!

for i in 0..<n {
    var result = ""
    
    for _ in stride(from: n - 1, to: i, by: -1) {
        result += " "
    }
    
    for _ in 0..<(2 * i + 1) {
        result += "*"
    }
    print(result)
}
