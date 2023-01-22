// 위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램 

let m = Int(readLine()!)!
var cup = 1

for i in 0..<m {
    let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
    var x = arr[0]
    var y = arr[1]
    
    if cup == x {
        cup = y
    }
    else if cup == y {
        cup = x
    }
}
print(cup)
