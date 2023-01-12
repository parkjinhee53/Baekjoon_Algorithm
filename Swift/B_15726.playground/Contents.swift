// 세 수가 연속해서 주어졌을 때 한 번의 곱셈 기호와 한 번의 나눗셈 기호를 이용하여 만든 식 중 가장 큰 값을 출력하는 프로그램 

let arr = readLine()!.split(separator: " ").map{Double($0)!}
var a = arr[0]
var b = arr[1]
var c = arr[2]

var x = Int((a * b) / c)
var y = Int((a / b) * c)

if x > y {
    print(x)
}
else {
    print(y)
}
