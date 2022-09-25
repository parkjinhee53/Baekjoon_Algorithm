// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램 

let s = Array(readLine()!)

for i in Character("a").asciiValue!...Character("z").asciiValue! {
    var char = Character(UnicodeScalar(i))
    
    if s.containschar {
        print("\(s.index(of: char)!)",terminator: " ")
    }
    else {
        print("-1", terminator: " ")
    }
}
