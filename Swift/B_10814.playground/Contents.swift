// 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램 

struct person {
    var name: String
    var age: Int
    var num: Int
}

let n = Int(readLine()!)!
var arr: [person] = []

for i in 0..<n {
    let a = readLine()!.split(separator: " ").map { String($0) }
    let one = person(name: a[1], age: Int(a[0])!, num: i)
    arr.append(one)
}

arr.sort { a, b in
    a.age == b.age ? a.num < b.num : a.age < b.age
}

for i in 0..<n {
    print("\(arr[i].age) \(arr[i].name)")
}
