// 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램 

let t = Int(readLine()!)!
var s: [String] = []

for _ in 1...t {
    s.append(readLine()!)
}

for i in s {
    let a = i.split(separator: " ")
    var new = ""
    for j in 0..<a.count {
        new += a[j].reversed() + " "
    }
    print(new)
}
