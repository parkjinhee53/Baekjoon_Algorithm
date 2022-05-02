// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램

let arr = readLine()!.split(separator: " ")
let a = Int(arr[0])!
let b = Int(arr[1])!

if (a > b) {
    print(">")
}
else if (a < b) {
    print("<")
}
else {
    print("==")
}
