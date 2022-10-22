// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램 

var x:[Int] = []
var y:[Int] = []
var x4 = 0
var y4 = 0

for _ in 1...3{
    let arr = readLine()!.split(separator: " ").map{Int($0)!}
        x.append(arr[0])
        y.append(arr[1])
}

if x[0] == x[1] {
    x4 = x[2]
}
else if x[0] == x[2]{
    x4 = x[1]
}
else{
    x4 = x[0]
}

if y[0] == y[1] {
    y4 = y[2]
}
else if y[0] == y[2]{
    y4 = y[1]
}
else{
    y4 = y[0]
}

print("\(x4) \(y4)")
