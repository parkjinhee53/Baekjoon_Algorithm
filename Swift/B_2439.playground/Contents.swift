// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

let n = Int(readLine()!)!

for i in 1 ... n {
    for _ in 0 ..< (n-i) {
        print(" ", terminator: "")
    }
    for _ in 0 ..< i {
        print("*", terminator: "")
    }
    print("")
}
