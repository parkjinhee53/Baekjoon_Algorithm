// 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램 

while let s = readLine() {
    
    var str = Array(s)
    var lower = 0
    var upper = 0
    var num = 0
    var space = 0
    
    for i in str {
        if i >= "a" && i <= "z" {
            lower += 1
        } else if i >= "A" && i <= "Z" {
            upper += 1
        } else if i == " " {
            space += 1
        } else {
            num += 1
        }
    }
    print("\(lower) \(upper) \(num) \(space)")
}
