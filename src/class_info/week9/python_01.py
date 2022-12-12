# 비트 연산자
def isEven(n):
    return (n & 1) != 1


def isXorEven(n):
    result = False
    if n ^ 1 == n + 1:
        result = True
    return result


n = int(input())

if isEven(n):
    print('Even')
else:
    print("Odd")

if isXorEven(n):
    print('Even')
else:
    print("Odd")



