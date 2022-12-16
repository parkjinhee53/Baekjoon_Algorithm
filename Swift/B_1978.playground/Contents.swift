// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램 

let n = Int(readLine()!)!
var num = readLine()!.split(separator: " ").map{Int(String($0))!}
var count = 0
var isPrime = true

for i in 0..<num.count {
    if num[i] == 1 {
        isPrime = false
    }
    else {
        for j in 2..<num[i] {
            if num[i] % j == 0 {
                isPrime = false
            }
        }
    }
    if isPrime == true {
        count += 1
    }
    isPrime = true
}
print(count)
