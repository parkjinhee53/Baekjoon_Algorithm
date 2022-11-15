// 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램 

var arr = (readLine()?.split(separator: " ").map{ Int($0)!})!
var n: Int = arr[0]
var k = arr[1]
var result = [Int]()

for i in 1...n {
    if n % i == 0 {
        result.append(i)
    }
}

if result.count >= k {
    print(result[k-1])
}
else {
    print(0)
}
