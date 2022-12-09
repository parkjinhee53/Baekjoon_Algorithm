// 제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램 

let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
var a = arr[0]
var b = arr[1]
var c = Int(readLine()!)!

var min = 60 * a + b
min += c

var hour = (min / 60) % 24
var minute = min % 60

print("\(hour) \(minute)")
