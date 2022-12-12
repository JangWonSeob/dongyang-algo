N, K = map(int, input().split())
arr = []
result = 0

for i in range(N):
    arr.append(int(input()))

for i in reversed(range(N)):
    result += int(K // arr[i])
    K = K % arr[i]
    if K <= 0:
        break

print(result)