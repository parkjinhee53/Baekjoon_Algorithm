// 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램 

let s = readLine()!
var sum = 0

for i in s {
    switch i {
    case "A", "B", "C":
        sum += 3
    case "D", "E", "F":
        sum += 4
    case "G", "H", "I":
        sum += 5
    case "J", "K", "L":
        sum += 6
    case "M", "N", "O":
        sum += 7
    case "P", "Q", "R", "S":
        sum += 8
    case "T", "U", "V":
        sum += 9
    case "W", "X", "Y", "Z":
        sum += 10
    default:
        sum += 0
    }
}
print(sum)
