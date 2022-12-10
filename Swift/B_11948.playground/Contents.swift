// 시험 점수의 합이 가장 높게 나오도록 과목을 선택할 때, JOI가 선택한 과목의 시험 점수의 합을 구하는 프로그램 

var a = Int(readLine()!)!
var b = Int(readLine()!)!
var c = Int(readLine()!)!
var d = Int(readLine()!)!

var arr = [Int]()
arr.append(a)
arr.append(b)
arr.append(c)
arr.append(d)

arr.sort(by: >)

var sum1 = arr[0] + arr[1] + arr[2]

var e = Int(readLine()!)!
var f = Int(readLine()!)!

var sum2 = max(e, f)

print(sum1 + sum2)
