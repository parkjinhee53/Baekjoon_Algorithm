// 알파벳 소문자로만 이루어진 단어가 주어졌을 때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램

let vowel = ["a","e","i","o","u"]
let s = readLine()!
var count = 0

for i in s {
    if vowel.contains(String(i)) {
        count += 1
    }
}

print(count)
