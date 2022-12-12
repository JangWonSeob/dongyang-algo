# 각 숫자의 합 구하기
N = int(input())
arr = list(input())
result = 0

for i in range(N):
    result += int(arr[i])

print(result)