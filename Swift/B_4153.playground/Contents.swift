// 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하는 프로그램

import Foundation

while true {
    let arr = readLine()!.split(separator: " ").map { Double(String($0))! }.sorted()
    let a = arr[0]
    let b = arr[1]
    let c = arr[2]
    
    if a == 0 && b == 0 && c == 0 {
        break
    }
    
    if pow(a, 2) + pow(b, 2) == pow(c, 2) {
        print("right")
    }
    else {
        print("wrong")
    }
}
