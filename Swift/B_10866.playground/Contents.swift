// 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램

let n = Int(readLine()!)!
var deque = [String]()

for _ in 0..<n {
    var a = readLine()!.split(separator: " ").map { String($0) }
    
    switch a[0] {
    case "push_front":
        deque.insert(a[1], at: 0)
    case "push_back":
        deque.append(a[1])
    case "pop_front":
        if deque.isEmpty {
            print(-1)
        }else{
            print(deque.removeFirst())
        }
    case "pop_back":
        if deque.isEmpty {
            print(-1)
        } else {
            print(deque.removeLast())
        }
    case "size":
        print(deque.count)
    case "empty" :
        if deque.isEmpty {
            print(1)
        }else {
            print(0)
        }
    case "front" :
        if deque.isEmpty {
            print(-1)
        } else {
            print(deque[0])
        }
    default:
        if deque.isEmpty {
            print(-1)
        } else{
            print(deque.last!)
        }
    }
}
