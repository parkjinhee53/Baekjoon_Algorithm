// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램

let n = Int(readLine()!)!
var arr = (readLine()?.split(separator: " ").map{ Float($0)!})!
var max = arr.max()!
var sum: Float = 0

for i in 0..<n {
    sum += arr[i] / max * 100
}

print(sum/Float(arr.count))
