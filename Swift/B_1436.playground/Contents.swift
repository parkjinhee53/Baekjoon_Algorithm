// 숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램

let n = Int(readLine()!)!
var count = 0

for i in 666...10000000000 {
    var a = i
    while a >= 666 {
        if(a % 1000 == 666) {
            count += 1
            break
        }
        a /= 10
    }
    if(count == n) {
        print(i)
        break
    }
}
