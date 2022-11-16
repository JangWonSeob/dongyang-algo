## 비밀지도 만들기(OR 연산 / 2진수)


# arr1 = [9, 20, 28, 18, 11]
# arr2 = [30, 1, 21, 17, 28]
# n = 5
n = int(input())
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

for i in range(n):
    row = arr1[i] | arr2[i]
    for j in reversed(range(n)):
        if ((row >> j) & 1) == 1:
            print('#', end='')
        else:
            print(' ', end='')
    print("")
