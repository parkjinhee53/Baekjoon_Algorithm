// 정수 N이 주어졌을 때, 소인수분해하는 프로그램 

var n = Int(readLine()!)!

if n == 1 {
    print("")
}
for i in stride(from: 2, through: n, by: 1) {
    while n % i == 0 {
        print("\(i)")
        n /= i
    }
}
