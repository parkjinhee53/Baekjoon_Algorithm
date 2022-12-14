// 오른쪽 기준으로 정렬한 별을 출력하는 프로그램 

let n = Int(readLine()!)!

for i in 0..<n {
    for j in n-i..<n {
        print(" ",terminator: "")
    }
    for k in i..<n {
        print("*", terminator: "")
    }
    print("")
}
