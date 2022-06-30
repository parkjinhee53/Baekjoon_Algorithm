// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램

let m = Int(readLine()!)!
let n = Int(readLine()!)!

var arr:[Int] = []
var sum = 0

for i in m...n {
    var isPrime = true // 소수면 true 아니면 false
    
    if i == 1 { // 1은 소수x
        continue
    }
    
    for j in 2..<i {
        if i % j == 0 {
            isPrime = false // 나눠떨어지면 소수x
            break
        }
    }
    if isPrime == true {
        arr.append(i)
    }
}

if arr.count == 0 { // 소수가 없다면 -1 출력
    print("-1")
}
else {
    for k in 0..<arr.count {
        sum += arr[k]
    }
    print(sum) // 합
    print(arr[0]) // 최솟값
}
