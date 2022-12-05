// N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램 

var n = Int(readLine()!)!
var result = 0

for _ in 0..<n {
    var sum = 0
    let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
    var a = arr[0]
    var b = arr[1]
    var c = arr[2]
    
    if(a == b && b == c) {
        sum = 10000 + (a * 1000)
    }
    else if(a == b || a == c) {
        sum = 1000 + (a * 100)
    }
    else if(b == c) {
        sum = 1000 + (b * 100)
    }
    else {
        var max = max(a, max(b, c))
        sum = max * 100
    }
    if(sum > result) {
        result = sum
    }
}
print(result)
