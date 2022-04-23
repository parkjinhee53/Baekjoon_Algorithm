// 곱셈

var a = Int(readLine()!)! // a 입력받기
var b = Int(readLine()!)! // b 입력받기

print(a*(b%10)) // 일의 자리 구하기
print(a*((b/10)%10)) // 십의 자리 구하기
print(a*((b/100)%10)) // 백의 자리 구하기
print(a*b) // a*b 값 출력
