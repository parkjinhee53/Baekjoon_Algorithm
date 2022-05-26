// 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램

var sum = 0
var arr = [Int]()

for i in 1...5 {
    let n = Int(readLine()!)!
    arr.append(n)
    sum += n
}

arr.sort() // 정렬

print(sum/5)
print(arr[2])
