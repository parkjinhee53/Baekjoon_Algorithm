// 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램

var arr = (readLine()?.split(separator: " ").map{ Int($0)!})!
var arr2 = (readLine()?.split(separator: " ").map{ Int($0)!})!

// 민국이의 총점
var s = arr[0] + arr[1] + arr[2] + arr[3]

// 만세의 총점
var t = arr2[0] + arr2[1] + arr2[2] + arr2[3]

if(s > t || s == t) {
    print(s);
}
else {
    print(t);
}
