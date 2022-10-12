// 수의 자릿수를 구하는 프로그램

let n = Int(String(readLine()!))!
var count = 0
var i = 1

while i <= n {
    count += n - i + 1
    i = i * 10
}
print(count)
