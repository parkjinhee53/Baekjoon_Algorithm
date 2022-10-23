// 하루 동안 측정한 결과가 주어지면, 이날의 총 이동 시간이 몇 분 몇 초인지 출력하는 프로그램 

var time = 0

for _ in 1...4 {
    time += Int(readLine()!)!
}

print(time / 60)
print(time % 60)
