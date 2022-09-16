// 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램 

let s = Array(readLine()!)
var result = [String]()

for i in 0..<s.count {
    var a = ""
    
    for j in i..<s.count {
        a += String(s[j])
    }
    result.append(a)
}
result = result.sorted()

for i in result {
    print(i)
}
