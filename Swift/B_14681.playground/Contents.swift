// 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램

let lineX = readLine()!
let lineY = readLine()!
let x = Int(lineX)!
let y = Int(lineY)!

if(x > 0) {
    if(y > 0) {
        print("1");
    }
    else {
        print("4");
    }
}
else {
    if(y > 0) {
        print("2");
    }
    else {
        print("3");
    }
}
