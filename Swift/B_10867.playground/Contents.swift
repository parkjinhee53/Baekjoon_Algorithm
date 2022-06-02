// N개의 정수를 오름차순으로 정렬하는 프로그램 (같은 정수는 한 번만 출력)

let n = Int(readLine()!)!
var set = Set<Int>()

readLine()!.split(separator: " ").map{ set.insert(Int($0)!) }
set.sorted().map{ print($0, terminator: " ") }
