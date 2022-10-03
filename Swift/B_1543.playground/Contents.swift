// 세준이는 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램 

import Foundation

var d = readLine()! // 문서
let w = readLine()! // 검색하려는 단어
var index = d.range(of: w)?.upperBound // 문서에 단어가 있으면 단어의 마지막 index
var count = 0

while index != nil {
    count += 1
    d = String(d[index!...])
    index = d.range(of: w)?.upperBound // 문서에서 다음 단어가 없으면 nil
}

print(count)
