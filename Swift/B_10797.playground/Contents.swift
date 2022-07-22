// 날짜의 일의 자리 숫자가 주어지고 5대의 자동차 번호의 일의 자리 숫자가 주어졌을 때 위반하는 자동차의 대수를 구하는 프로그램

let n = Int(readLine()!)!
let car = readLine()!.split(separator: " ").map { Int($0)! }
var count = 0

for i in car {
    if(n == i) {
        count += 1
    }
}

print(count)
