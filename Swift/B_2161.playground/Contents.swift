// N이 주어졌을 때, 버린 카드들을 순서대로 출력하고, 마지막에 남게 되는 카드를 출력하는 프로그램 

public struct Queue<T> {
    private var queue = [T]()
    public init() {}
    
    public mutating func enqueue(_ element: T) { // 새로운 요소 추가
        queue.append(element)
    }
    public mutating func dequeue() -> T? { // 첫 번째 요소 제거
        return queue.removeFirst()
    }
    public func isEmpty() -> Bool { // 비어있으면 true, 그렇지 않으면 false
        return queue.isEmpty
    }
}

let n = Int(readLine()!)!
var q = Queue<Int>()
var arr = [Int]()

for i in 1...n {
    q.enqueue(i)
}

while(!q.isEmpty()) {
    arr.append(q.dequeue()!) // 제일 위에 있는 카드 버려서 arr에 저장
    
    if(q.isEmpty()) {
        break
    }
    q.enqueue(q.dequeue()!) // 제일 위에 있는 카드 맨 뒤로 이동
}

for i in arr {
    print(i, terminator: " ")
}
