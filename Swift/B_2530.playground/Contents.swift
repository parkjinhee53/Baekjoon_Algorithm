// 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 초 단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램 

var arr = readLine()!.split(separator: " ").map{Int($0)!}
var h = arr[0]
var m = arr[1]
var s = arr[2]
var d = Int(readLine()!)!

print((h + (m + (s + d)/60)/60) % 24, (m + (s + d) / 60) % 60, (s + d) % 60)
