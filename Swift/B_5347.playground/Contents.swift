// 두 수 a와 b가 주어졌을 때, a와 b의 최소 공배수를 구하는 프로그램

func gcd(_ min: Int, _ max: Int) -> Int { // 최대 공약수
    var mod = min % max
    
    if(mod == 0) {
        return max
    }
    else {
        return gcd(max, mod)
    }
}

let n = Int(readLine()!)!

for _ in 0..<n {
    var arr = readLine()!.split(separator: " ").map{Int(String($0))!}
    var max = arr.max()! // a
    var min = arr.min()! // b
    
    print(arr[0] * arr[1] / gcd(min, max)) // 최소 공배수
}
