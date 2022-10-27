// 상근이가 겨울 방학동안 숙제를 하지 않고 놀 수 있는 최대 날의 수를 구하는 프로그램 

let l = Int(readLine()!)!
let a = Int(readLine()!)!
let b = Int(readLine()!)!
let c = Int(readLine()!)!
let d = Int(readLine()!)!
var max1: Int = 0
var max2: Int = 0
var max3: Int = 0

if a % c == 0 {
    max1 = a / c
}
else {
    max1 = a / c + 1
}

if b % d == 0 {
    max2 = b / d
}
else {
    max2 = b / d + 1
}

max3 = max(max1, max2)

print(l - max3)
