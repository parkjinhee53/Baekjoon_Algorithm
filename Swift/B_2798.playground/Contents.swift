// N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구하는 프로그램

let arr = readLine()!.split(separator: " ").map{ Int($0)! }
let n = arr[0]
let m = arr[1]
var card = readLine()!.split(separator: " ").map{Int($0)!}
var sum = 0

for i in 0..<n {
    for j in i+1..<n {
        for k in j+1..<n {
            if card[i] + card[j] + card[k] <= m {
                if card[i] + card[j] + card[k] > sum {
                    sum = card[i] + card[j] + card[k]
                }
            }
        }
    }
}
print(sum)
