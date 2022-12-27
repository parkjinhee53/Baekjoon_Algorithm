// 삼각형의 세 각을 입력받은 다음, 삼각형의 종류를 출력하는 프로그램 

var arr = [Int]()
var sum = 0

for _ in 0..<3 {
    arr.append(Int(readLine()!)!)
}

for i in arr {
    sum += i
}

if sum != 180 {
    print("Error")
}
else {
    if (arr[0] == 60) && (arr[1] == 60) && (arr[2] == 60) {
        print("Equilateral")
    }
    else {
        if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
            print("Isosceles")
        }
        else {
            print("Scalene")
        }
    }
}

