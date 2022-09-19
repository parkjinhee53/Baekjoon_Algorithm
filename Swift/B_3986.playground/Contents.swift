// '좋은 단어' 개수를 세는 프로그램 

let n = Int(readLine()!)!
var count = 0

for _ in 0..<n {
    var arr = [String]()
    let a = readLine()!.map {String($0)}
    
    for i in a {
        if i == arr.last {
            arr.removeLast()
        }
        else {
            arr.append(i)
        }
    }
    if arr.isEmpty {
        count += 1
    }
}
print(count)
