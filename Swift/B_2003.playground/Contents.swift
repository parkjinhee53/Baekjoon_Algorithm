// 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램

let a = readLine()!.split(separator: " ").map{Int(String($0))!}
let n = a[0]
let m = a[1]

let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
var count = 0

for i in 0..<n {
    var sum = 0
    for j in i..<n {
        sum += arr[j]
        if (sum == m) {
            count += 1
        }
    }
}

print(count)
