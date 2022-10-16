// X가 주어졌을 때, X번째 분수를 구하는 프로그램

let x = readLine()!
var N = Int(x)!
var n : Int = 1

while true {
    let temp = N - n
    if temp <= 0 {
        if n % 2 == 0 {
            print("\(N)/\((n - N + 1))")
            break
        } else {
            print("\(n - N + 1)/\(N)")
            break
        }
    } else if temp > 0 {
        N = temp
        n += 1
    }
}
