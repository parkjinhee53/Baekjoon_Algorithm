// A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램

let arr = (readLine()?.split(separator: " ").map{ Int($0)! })!
let a = arr[0] // 고정 비용
let b = arr[1] // 가변 비용
let c = arr[2] // 상품 가격

if(b >= c) { // 손익분기점이 존재하지 않으면 -1을 출력
    print(-1);
}
else { // 최초로 이익이 발생하는 판매량을 출력
    print((a / (c - b)) + 1);
}
