# 미로 찾기
N = int(input())
arr = input().split(' ')
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
result = [1, 1]

for i in range(len(arr)):
    tempX = result[0]
    tempY = result[1]
    if arr[i] == "U":
        tempX += dx[0]
        tempY += dy[0]
    elif arr[i] == "D":
        tempX += dx[1]
        tempY += dy[1]
    elif arr[i] == "L":
        tempX += dx[2]
        tempY += dy[2]
    elif arr[i] == "R":
        tempX += dx[3]
        tempY += dy[3]

    if 0 < tempX <= N and 0 < tempY <= N:
        result[0] = tempX
        result[1] = tempY

print(result)