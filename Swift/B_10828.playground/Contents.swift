// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램

var stack:[Int] = []
let n = Int(readLine()!)!

for _ in 1...n {
    let a = readLine()!.split(separator: " ").map{String($0)}
    switch a[0] {
    case "push":
        push(Int(a[1])!)
        break
    case "pop":
        print(pop())
        break
    case "size":
        print(size())
        break
    case "empty":
        print(empty())
        break
    case "top":
        print(top())
        break
    default:
        break
    }
}


func push(_ x: Int){
    stack.append(x)
}

func pop() -> Int{
    if let pop = stack.popLast() {
        return pop
    }else {
       return -1
    }
}

func size() ->Int{
    return stack.count
}

func empty() -> Int{
    if stack.isEmpty {
        return 1
    }else {
        return 0
    }
}

func top() -> Int{
    if let last = stack.last {
        return last
    }else {
        return -1
    }
}
