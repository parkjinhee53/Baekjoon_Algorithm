// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램

let t = Int(readLine()!)!
for _ in 1...t {
    let arr = readLine()!.split(separator: " ")
    let r = Int(arr[0])!
    let s = arr[1]
    
    for i in s {
        for _ in 1...r {
            print("\(i)", terminator: "")
        }
    }
    print("")
}
