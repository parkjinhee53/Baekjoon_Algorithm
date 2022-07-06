// 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램

let arr = readLine()!.split(separator: " ").map{Int(String($0))!}

let a = arr[0]
let b = arr[1]
let v = arr[2]

var day = (v - b) / (a - b)

if (v - a) % (a - b) != 0 {
    print(day + 1)
}
else {
    print(day)
}
