// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램

let arr = readLine()!.split(separator: " ").map{Int(String($0))!}

let n = arr[0]
let x = arr[1]

let a = readLine()!.split(separator: " ").map{Int(String($0))!}

for i in a {
    if i < x {
        print(i, terminator: " ")
    }
}
