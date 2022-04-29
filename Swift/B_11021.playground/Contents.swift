// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 

let t = Int(readLine()!)! // 테스트 케이스의 개수 입력받기

for i in 1...t{ // 입력받은 테스트 케이스의 개수만큼 반복
    let arr = readLine()!.split(separator: " ")
    let a = Int(arr[0])!
    let b = Int(arr[1])!
    print("Case #\(i): \(a+b)")
}
