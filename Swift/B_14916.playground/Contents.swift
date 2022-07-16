// 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램

var n = Int(readLine()!)!
var count = 0

while(n>0) {
    if(n % 5 == 0) {
        count += n / 5
        break
    }
    n -= 2
    count += 1
}

if(n < 0) {
    print("-1")
}
else {
    print(count)
}
