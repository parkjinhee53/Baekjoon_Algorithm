// 자연수 N과 정수 K가 주어졌을 때 이항 계수를 구하는 프로그램

let arr = readLine()!.split(separator: " ").map{ Int($0)! }
let n = arr[0]
let k = arr[1]

print(fac(n) / (fac(n-k) * fac(k)))

func fac(_ x: Int) -> Int{
    if x <= 1{
        return 1
    }
    
    return x * fac(x-1)
}
