// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램 

var a = Int(readLine()!)!
var b = Int(readLine()!)!
var c = Int(readLine()!)!
var result = String(a * b * c)
var arr = [Character]()

for i in result {
    arr.append(i)
}

for i in 0...9{
    var a = arr.filter{Int(String($0))! == i}
    var n = a.count
    print(n)
}
