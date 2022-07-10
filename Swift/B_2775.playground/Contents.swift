// 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 구하는 프로그램

let t = Int(readLine()!)!

for _ in 1...t {
    let k = Int(readLine()!)! // 층
    let n = Int(readLine()!)! // 호 
    var arr = Array(repeating: Array(repeating: 0, count: n + 1), count: k + 1)
    
    for i in 0...k {
        for j in 0...n {
            if i == 0 { // 0층일 때
                arr[i][j] = j + 1
            }
            else {
                if j == 0 { // 1호일 때
                    arr[i][j] = 1
                }
                else {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j]
                }
            }
        }
    }
    print(arr[k][n - 1])
}
