// 강산이가 캠핑장을 최대 며칠동안 사용할 수 있는지 구하는 프로그램 

var count = 0

while true {
    count += 1
    let input = readLine()!.split(separator: " ").map { Int(String($0))! }
    let l = input[0]
    let p = input[1]
    let v = input[2]
    
    if l == 0 && p == 0 && v == 0 {
            break
        }
    
    var day = (v / p) * l // 최대 며칠인지
    
    if (v % p) != 0 {
        if (v % p) <= l {
            day += (v % p)
        }
        else {
            day += l
        }
    }
    
    print("Case \(count): \(day)")
}
