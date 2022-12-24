// N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램 

var n = Int(readLine()!)!
var count = 0

while(n >= 5 ) {
    count += n / 5
    n /= 5
}
print(count)
