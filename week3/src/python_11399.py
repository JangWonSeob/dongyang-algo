N = int(input())
P = list(map(int, input().split()))
result = 0

P.sort()

for i in range(N):
    result += sum(P[0:i+1])

print(result)
