// N개의 숫자를 모두 합해서 출력하는 프로그램

let n = Int(readLine()!)!
let s = readLine()!
var sum:Int = 0

for i in s {
    sum += Int(String(i))! // Int형으로 바꿔서 더해줌
}

print(sum)
