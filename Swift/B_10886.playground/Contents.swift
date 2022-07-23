// 설문조사를 하여 준희가 귀여운지 아닌지 알아보는 프로그램

let n = Int(readLine()!)!
var count = 0 // cute
var ncount = 0 // not cute

for _ in 0..<n {
    let a  = Int(readLine()!)!
    if(a == 0) {
        ncount += 1
    }
    else {
        count += 1
    }
}

if (count > ncount) {
    print("Junhee is cute!")
}
else {
    print("Junhee is not cute!")
}
