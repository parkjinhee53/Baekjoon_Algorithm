// 개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램

var arr:[Int] = []

for _ in 1...9 {
   arr.append(Int(readLine()!)!)
}

// 최댓값이 몇 번째 수인지 확인 
let index = arr.firstIndex(of: arr.max()!)! + 1

print(arr.max()!)
print(index)
