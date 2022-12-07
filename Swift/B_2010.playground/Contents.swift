// 최대 몇 대의 컴퓨터를 전원에 연결할 수 있는지 구하는 프로그램 

let n = Int(readLine()!)!
var a = 0

for _ in 0..<n{
    a += Int(readLine()!)!
}
print(a-(n-1))
