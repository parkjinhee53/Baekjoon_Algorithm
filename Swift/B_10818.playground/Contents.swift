// N개의 정수가 주어졌을 때, 최솟값과 최댓값을 구하는 프로그램

let n = Int(readLine()!)!
let num = readLine()!.split(separator: " ").map{Int(String($0))!}

print(num.min()!, num.max()!)
