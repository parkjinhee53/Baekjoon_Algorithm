// 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 구하는 프로그램 

var x = Int(readLine()!)!
var count = 0

while x > 0 {
    x &= (x-1)
    count += 1
}
print(count)
