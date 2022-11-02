# 입력 값이 1이 될 때까지 (방식 /, -1)
N, K = map(int, input().split())
result = 0

while N >= K:
    result += N % K
    N //= K
    result += 1

print(result)