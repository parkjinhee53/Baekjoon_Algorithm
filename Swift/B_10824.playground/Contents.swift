// A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램 

let arr = readLine()!.split(separator: " ").map{ String($0) }
var ab = ""
var cd = ""

for i in 0..<arr.count {
    if i == 0 || i == 1 {
        ab += arr[i]
    }
    else {
        cd += arr[i]
    }
}

print(Int(ab)! + Int(cd)!)
