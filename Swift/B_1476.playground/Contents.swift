// E, S, M이 주어졌고, 1년이 준규가 사는 나라에서 1 1 1일때, 준규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램

let arr = readLine()!.split(separator: " ").map{Int($0)!}
var a = 1
var e = 1
var s = 1
var m = 1

while true {
    if e > 15 {
        e = 1
    }
    if s > 28 {
        s = 1
    }
    if m > 19 {
        m = 1
    }
    if e == arr[0] && s == arr[1] && m == arr[2] {
        break
    }
    a += 1
    e += 1
    s += 1
    m += 1
}
print(a)
