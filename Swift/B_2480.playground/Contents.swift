// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램

let nums = readLine()!.split(separator: " ").map { Int($0)! }.sorted(by: >)

let s = Set<Int>(nums)

// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원
if s.count == 1 { // count가 1이면 같은 눈이 3개 (중복 제거)
    print(10000 + nums[0] * 1000)
}
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원
else if s.count == 2 {
    print(1000 + nums[1] * 100)
}
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원
else {
    print(nums[0] * 100)
}

