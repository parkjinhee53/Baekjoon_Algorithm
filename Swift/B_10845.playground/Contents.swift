// 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 

var queue: [Int] = []

func push(_ n : Int) {
    queue.append(n)
}

func pop() -> Int {
    if size() == 0 {
        return -1
    }
    else {
        return queue.removeFirst()
    }
}

func size() -> Int {
    return queue.count
}

func empty() -> Int {
    if queue.isEmpty {
        return 1
    }
    else {
        return 0
    }
}

func front() -> Int {
    if queue.isEmpty {
        return -1
    }
    else {
        return queue.first!
    }
}

func back() -> Int {
    if queue.isEmpty {
        return -1
    } else {
        return queue.last!
    }
}

let n = Int(readLine()!)!

for _ in 1...n {
    let a = readLine()!.split(separator: " ")
    switch String(a[0]) {
    case "push":
        push(Int(a[1])!)
    case "pop":
        print(pop())
    case "size":
        print(size())
    case "empty":
        print(empty())
    case "front":
        print(front())
    case "back":
        print(back())
    default:
        break
    }
}
