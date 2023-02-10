// 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력하는 프로그램 

let n = Int(readLine()!)!

for i in 0..<n {
    var result = ""
    
    for _ in stride(from: n - i - 1, to: 0, by: -1) {
        result += " "
    }
    
    for _ in 0..<2 * i + 1 {
        result += "*"
    }
    
    print(result)
}

for i in 0..<n-1 {
    var result = ""
    
    for _ in 0...i {
        result += " "
    }
    
    for _ in stride(from: 2 * (n - 1) - 2 * i - 1, to: 0, by: -1) {
        result += "*"
    }
    
    print(result)
}
