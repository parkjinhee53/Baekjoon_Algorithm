// 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력하는 프로그램

import Foundation

var s = readLine()!

var arr = ["c=","c-","dz=","d-","lj","nj","s=","z="]

for i in 0...arr.count-1 {
    s = s.replacingOccurrences(of: arr[i] , with: "1")
}
print(s.count)
