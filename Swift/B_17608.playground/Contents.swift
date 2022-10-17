// N개의 막대기에 대한 높이 정보가 주어질 때, 오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램

let n = Int(readLine()!)!
var stack = [Int]()

for _ in 0..<n {
    let h = Int(readLine()!)!
    while !stack.isEmpty, stack.last! <= h {
        stack.removeLast()
    }
    stack.append(h)
}
print(stack.count)
