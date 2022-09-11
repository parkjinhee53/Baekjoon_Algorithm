// N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램

let arr = readLine()!.split(separator: " ").map { Int($0)! }
var num = [Int]()
var result = [Int]()
var index = arr[1] - 1

for i in 1..<arr[0]+1 {
    num.append(i)
}

while true {
    result.append(num.remove(at: index))
    if(num.isEmpty) {
        break
    }
    index = (index + arr[1]-1) % num.count
}


print("<" + result.map({String($0)}).joined(separator: ", ") + ">")
