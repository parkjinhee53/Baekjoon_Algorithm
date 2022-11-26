// 과일을 옮길 때, 과일을 옮기는 최소 횟수를 구하는 프로그램 

let one = readLine()!.split(separator: " ").map{Int(String($0))!}
var a = one[0]
var b = one[1]

let two = readLine()!.split(separator: " ").map{Int(String($0))!}
var c = two[0]
var d = two[1]

if((a + d) > (b + c)) {
    print(b+c)
}
else {
    print(a+d)
}
