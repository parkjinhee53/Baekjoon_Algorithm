// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램

let n = Int(readLine()!)!
var count = 0

for i in 0..<n {
    var word = readLine()!
    var arr:[Character] = []
    
    for j in word {
        if !arr.contains(j) { // arr 배열에 포함되어 있지 않으면 추가
            arr.append(j)
        }
        else if arr.last != j { // arr 배열의 마지막 문자와 동일한지 확인
            break
        }
        else {
            arr.append(j)
        }
        if word.count == arr.count {
            count += 1
        }
    }

}
print(count)

