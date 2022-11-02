n = int(input())
arr = list(input())
sum = 0

if n == len(arr):
    for i in range(n):
        sum += int(arr[i])

print(sum)
