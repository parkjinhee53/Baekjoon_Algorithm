// 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램

let n = Int(readLine()!)!

func gcd(_ m: Int, _ n: Int) -> Int {
    if n == 0 {
        return m
    } else {
        return gcd(n, m%n)
    }
}


for _ in 0..<n {
    let a = readLine()!.split(separator: " ").map { Int(String($0))! }
    var arr: [Int] = []
    var result = 0
    
    for i in 1..<a.count - 1 {
        for j in i+1..<a.count {
            arr.append(gcd(a[i], a[j]))
        }
    }
    
    for i in arr {
        result += i
    }
    print(result)
}

