// 각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구해내는 프로그램 

let n = Int(readLine()!)!
var ropes: [Int] = []
var result = 0

for _ in 0..<n {
    let a = Int(readLine()!)!
    ropes.append(a)
}

ropes.sort(by: >)

for i in 0..<n {
    result = max(result, ropes[i] * (i+1))
}

print(result)
