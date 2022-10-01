// 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하는 프로그램 

let n = Int(readLine()!)!
var arr = Array(repeating: Array(repeating: 0, count: 2), count: n)
var result = Array(repeating: 1, count: n)

for i in 0..<n {
    arr[i] = readLine()!.split(separator: " ").map{Int($0)!}
}

for i in 0..<n {
    for j in 0..<n {
        if arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] {
            result[i] += 1
        }
    }
}
for i in 0..<n {
    print("\(result[i])", terminator: " " )
}
