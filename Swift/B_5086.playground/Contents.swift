// 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램

while(true) {
    let arr = readLine()!.split(separator: " ")
    let a = Int(arr[0])!
    let b = Int(arr[1])!
    
    if(a == 0 && b == 0) {
        break
    }
    
    if(b % a == 0) { // 약수
        print("factor");
    }
    else if(a % b == 0) { // 배수
        print("multiple");
    }
    else { // 약수와 배수 모두 아님
        print("neither");
    }
}
