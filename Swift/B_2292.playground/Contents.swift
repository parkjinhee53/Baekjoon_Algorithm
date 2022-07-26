// 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램

let n = Int(readLine()!)!

var sum = 1
var i = 0
while true {
    sum += 6 * i
    if n <= sum {
        print(i + 1)
        break
    }

    i += 1
}
