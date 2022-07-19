// 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램

let n = Int(readLine()!)!
var set = Set<String>()

for _ in 0..<n {
    let arr = readLine()!.split(separator: " ").map{String($0)}
    let name = arr[0]
    let state = arr[1]
    
    if state == "enter" {
        set.insert(name)
    }
    else { // leave인 경우
        set.remove(name)
    }
}

let a = set.sorted(by: >)

for name in a {
    print(name)
}
