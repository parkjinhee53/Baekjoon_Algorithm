// 과자 한 개의 가격, 사려고 하는 과자의 개수와 동수가 현재 가진 돈의 액수가 주어질 때 동수가 부모님께 받아야 하는 돈의 액수를 출력하는 프로그램

let arr = readLine()!.split(separator: " ").map { Int($0)! }

if arr[0] * arr[1] > arr[2] {
    print(arr[0] * arr[1] - arr[2])
} else {
    print(0)
}
