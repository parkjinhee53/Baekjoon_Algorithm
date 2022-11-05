// 2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램 

let nm = readLine()!.split(separator: " ").map{ Int($0)! }
var arr = [[Int]]()

for _ in 0..<nm[0] {
    arr.append(readLine()!.split(separator: " ").map{ Int($0)! })
}

var k = Int(readLine()!)!

for _ in 0..<k {
    let array = readLine()!.split(separator: " ").map{ Int($0)! - 1 }
    let i = array[0]
    let j = array[1]
    let x = array[2]
    let y = array[3]
    var sum = 0
    
    for i in i...x {
        for j in j...y {
            sum += arr[i][j]
        }
    }
    print(sum)
}

