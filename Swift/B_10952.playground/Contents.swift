// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램

while true {
    var arr = readLine()!.split(separator: " ")
    var a = Int(arr[0])!
    var b = Int(arr[1])!
    
    if(a == 0 && b == 0) {
        break
    }
    print(a+b)
}
