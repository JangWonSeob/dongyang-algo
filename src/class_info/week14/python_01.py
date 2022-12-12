## 구간 합 빠르게 계산하기

n, m = map(int, input().split())

arr = list(map(int, input().split()))

sum_arr = []
result = []

sumValue = 0
sum_arr.append(sumValue)

for i in range(len(arr)):
    sum_arr.append(sum(arr[:i + 1]))

for i in range(m):
    start, end = map(int, input().split())
    result.append(sum_arr[end] - sum_arr[start - 1])

print(result)
