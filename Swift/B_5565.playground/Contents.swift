// 책 10권의 총 가격과 가격을 읽을 수 있는 9권 가격이 주어졌을 때, 가격을 읽을 수 없는 책의 가격을 구하는 프로그램 

var sum = Int(readLine()!)!

for _ in 0..<9 {
    var book = Int(readLine()!)!
    sum -= book
}

print(sum)
