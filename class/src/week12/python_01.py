## 배열의 모든 왼쪽 값은 자신의 값보다 작고, 모든 오른쪽 값은 자신의값보다 큰 항목 찾기

arr = [5, 1, 4, 3, 6, 8, 10, 7, 9]
n = len(arr)

leftMax = [0] * (n - 1)
rightMin = [0] * (n - 1)

leftMax.append(-99999)

for i in range(1, n):
    leftMax[i] = min(leftMax[i - 1], arr[i - 1])

rightMin.append(99999)
for i in reversed(range(n - 2)):
    if rightMin[i + 1] > arr[i + 1]:
        rightMin[i] = arr[i + i]
    else:
        rightMin[i] = rightMin[i + 1]

yn = True

for i in reversed(range(n)):
    if leftMax[i] < arr[i] < rightMin[i]:
        print(i)
        yn = False
        break
    rightMin[i] = min(rightMin[i], arr[i])

if yn:
    print(-1)
