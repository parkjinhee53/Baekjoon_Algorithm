// 사용자로부터 정수인 월과 일을 입력받아 날짜가 2월 18일인지 전인지 후인지를 출력하는 프로그램

let month = Int(readLine()!)!
let day = Int(readLine()!)!

if month < 2 { // 2월 전일 때 
    print("Before")
}
else if month >= 3 {
    print("After")
}
else { // 2월일 때,
    if day < 18 {
        print("Before")
    }
    else if day == 18 {
        print("Special")
    }
    else {
        print("After")
    }
}
