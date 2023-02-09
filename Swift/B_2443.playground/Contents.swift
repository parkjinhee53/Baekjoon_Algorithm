// 첫째 줄에는 별 2×N-1개, 둘째 줄에는 별 2×N-3개, ..., N번째 줄에는 별 1개를 찍는 프로그램 

let n = Int(readLine()!)!

for i in 0..<n {
    var result = ""
    
    for _ in 0..<i {
        result += " "
    }
    
    for _ in 0..<2*(n-i)-1 {
        result += "*"
    }
    
    print(result)
}
