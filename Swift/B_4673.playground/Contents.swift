// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램 

var arr:[Int] = []
var set:Set<Int> = []

for  i in 1...10000 {
    set.insert(d(i))
}

for i in 1...10000 {
    if !set.contains(i) {
        print(i)
    }
}

func d(_ n:Int) -> Int {
    var sum = n
    var num = n
    while n != 0 {
        sum += num % 10
        num /= 10

        if num == 0 {
            break
        }
    }
    return sum
}
