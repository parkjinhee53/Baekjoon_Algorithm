// 상을 받는 커트라인이 몇 점인지 구하는 프로그램 

let input = readLine()!.split(separator: " ").map { Int(String($0))! }
let n = input[0]
let k = input[1]

var arr = readLine()!.split(separator: " ").map{Int($0)!}

arr.sort()

print(arr[n-k])

