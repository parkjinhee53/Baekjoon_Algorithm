// 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력하는 프로그램 

let n = Int(readLine()!)!

for i in 0..<n {
    var result = ""
    
    for _ in 0...i {
        result += "*"
    }
    result += " "
    
    print(result)
}

for i in stride(from: n-1, to: 0, by: -1) {
    var result = ""
    
    for _ in 0..<i {
        result += "*"
    }
        result += " "
    
    print(result)
}
