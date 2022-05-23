// 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램

let a = readLine()!.split(separator: " ")

if a == a.sorted() { // 정렬
    print("ascending")
}
else if a == a.sorted(by: >) { // 역순
    print("descending")
}
else {
    print("mixed")
}
