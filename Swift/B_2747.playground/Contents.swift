// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램 

var n = Int(readLine()!)!
var dp = Array(repeating: 0, count: n+1)

dp[0] = 0
dp[1] = 1

if n > 1 {
    for i in 2...n {
        dp[i] = dp[i-1] + dp[i-2]
    }
}
print(dp[n])
