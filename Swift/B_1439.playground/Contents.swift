// 문자열 S가 주어졌을 때, 다솜이가 해야하는 행동의 최소 횟수를 구하는 프로그램 

let s = readLine()!.map(){ String($0) }
var zero = 0
var one = 0
var first = s.first!

if first == "0" {
    one += 1
}
else {
    zero += 1
}

for i in s {
    if i != first {
        if i == "1" {
            zero += 1
        }
        else {
            one += 1
        }
        first = i
    }
}

print(min(zero, one))
