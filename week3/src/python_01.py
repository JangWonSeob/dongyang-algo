N, K = map(int, input().split())
count = 0
2
while N != 1:
    if N % K == 0:
        N /= K
    else:
        N -= 1
    count +=1

print(count)
