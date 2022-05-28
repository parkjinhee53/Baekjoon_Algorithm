// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램

let n = Int(readLine()!)!

print("\(fibonacci(n))")

func fibonacci(_ n: Int) -> Int{
    if n == 0 {
        return 0
    }
    if n == 1 {
        return 1
    }
    return fibonacci(n-1) + fibonacci(n-2)
}

