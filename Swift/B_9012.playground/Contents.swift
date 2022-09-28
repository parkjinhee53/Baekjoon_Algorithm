// 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내는 프로그램 

let n = Int(readLine()!)!

for _ in 0..<n {
    let s = readLine()!
    var stack = [Character]()
    
    for i in s {
        if(i == "(") {
            stack.append(i)
        }
        else if(i == ")") {
            guard let pop = stack.last, pop == "(" else {
                stack.append(i)
                break
            }
            stack.removeLast()
        }
    }
    print(stack.isEmpty ? "YES" : "NO")
}
