# 0 뒤로 배치
arr = [6, 0, 8, 2, 3, 0, 4, 0, 1]

j = 0
for i in range(len(arr)):
    if arr[i] != 0:
        arr[j] = arr[i]
        j += 1

for i in range(j, len(arr)):
    arr[i] = 0

print(arr)