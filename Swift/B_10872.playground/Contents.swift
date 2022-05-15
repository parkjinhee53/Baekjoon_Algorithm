// 0보다 크거나 같은 정수 N이 주어졌을 때, N!을 출력하는 프로그램

let n = Int(readLine()!)!

print(factorial(n))

// 재귀함수
func factorial(_ n: Int) -> Int {
    if n == 0 {
        return 1
    }
    return n * factorial(n - 1)
}
