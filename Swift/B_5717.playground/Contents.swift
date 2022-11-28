// 상근이의 남자 친구의 수와 여자 친구의 수가 주어졌을 때, 친구는 총 몇 명인지 구하는 프로그램 

while true {
    let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
    var a = arr[0]
    var b = arr[1]
    
    if(a == 0 && b == 0) { break }
    
    print(a + b)
}
