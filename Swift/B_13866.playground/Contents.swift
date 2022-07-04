// 두 팀의 스킬 레벨 차이의 최솟값을 구하는 프로그램

var arr = readLine()!.split(separator: " ").map{Int(String($0))!}

let sum1 = arr[0] + arr[3]
let sum2 = arr[1] + arr[2]

print(abs(sum1 - sum2))
