// 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램

let arr = readLine()!.split(separator: " ")

// reversed() 문자열 거꾸로 뒤집기
var a = Int(String(arr[0].reversed()))!
var b = Int(String(arr[1].reversed()))!

if a < b {
    print(b)
}
else {
    print(a)
}
