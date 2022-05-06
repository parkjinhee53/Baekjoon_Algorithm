// 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램

var sum = 0

for _ in 0..<5 {
    let score = Int(readLine()!)!
    
    if score < 40 {
            sum += 40
        }
        else {
            sum += score
        }
}

print(sum/5)
