// 자연수 A, B가 주어지면 A+B를 구하는 프로그램 

let n = Int(readLine()!)!

if 100 > n {
    print((n / 10) + (n % 10))
}
else if n % 10 == 0 {
    print((n / 100) + 10)
}
else {
    print((n % 100) + 10)
}
