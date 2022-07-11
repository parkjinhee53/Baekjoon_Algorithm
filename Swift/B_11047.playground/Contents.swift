// 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 할 때 필요한 동전 개수의 최솟값을 구하는 프로그램

let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
var n = arr[0]
var k = arr[1]

var coin: [Int] = []
var count: Int = 0

for i in 0..<n {
    coin.append(Int(readLine()!)!)
}

coin.reverse() // 거꾸로 

for i in coin {
    count += k / i
    k = k % i
}

print(count)
