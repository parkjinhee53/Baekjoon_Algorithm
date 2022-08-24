// 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램 

let arr = readLine()!.split(separator: " ").map{ Int($0)! }
let h = arr[0]
let m = arr[1]

if(m >= 45) {
    print("\(h) \(m-45)")
}
else if(h == 0) {
    print("23 \(m+15)")
}
else {
    print("\(h-1) \(m+15)")
}
