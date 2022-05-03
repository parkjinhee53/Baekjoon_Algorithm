// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램

let y = Int(readLine()!)!

if(y % 4 == 0) {
    if(y % 400 == 0) {
        print("1");
    }
    else if(y % 100 == 0) {
        print("0");
    }
    else {
        print("1");
    }
}
else {
    print("0");
}
