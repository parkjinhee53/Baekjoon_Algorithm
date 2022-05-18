// 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램

var sum:Int = 0
var min = Int.max

for _ in 1...7 {
    var n = Int(readLine()!)!
    
    if(n % 2 == 1) { // 홀수
        sum += n
        if(min > n) {
            min = n
        }
    }
}

// 홀수가 존재하지 않으면 첫째 줄에 -1 출력
if(sum == 0) {
    print(-1)
}

print(sum)
print(min)

