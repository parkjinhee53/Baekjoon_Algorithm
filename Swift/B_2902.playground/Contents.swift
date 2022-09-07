// 긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력하는 프로그램

let name = readLine()!.split(separator: "-")
var s = ""
for i in name {
    s += String(i.first!)
}
print(s)
