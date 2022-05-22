// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램

var set =  Set<Int>()

for i in 1...10 {
    let n = Int(readLine()!)!
    set.insert(n % 42) // 중복된 값은 안들어감
}

print(set.count)
