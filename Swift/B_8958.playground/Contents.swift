// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램

let n = Int(readLine()!)!
var arr: [Character] = []

for i in 1...n {
    arr = Array(readLine()!)
    var cnt = 0
    var sum = 0
    
    for j in arr {
        if j == "O" {
            cnt += 1
            sum += cnt
        }
        else {
            cnt = 0
        }
    }
    print(sum)
}
