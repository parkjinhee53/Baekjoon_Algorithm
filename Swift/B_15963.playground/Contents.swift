// 선생님이 송찬이가 필요한 배터리 종류를 들고 왔는지 확인하는 프로그램 

let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
var n = arr[0]
var m = arr[1]

if(n == m) {
    print(1)
}
else {
    print(0)
}
