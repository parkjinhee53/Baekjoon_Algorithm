// 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램 

let a = Int(readLine()!)!
let arr = readLine()!.split(separator: " ").map{Int($0)!}

print("\(arr.min()! * arr.max()!)")
