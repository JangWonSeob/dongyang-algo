# 비트 연산자(홀수, 짝수 구분)

def isEven(x):
    return (x & 1) != 1


def isXorEven(x):
    return (x ^ 1) == (x + 1)


n = int(input())
if isEven(n):
    print('짝수')
else:
    print('홀수')

if isXorEven(n):
    print('짝수')
else:
    print('홀수')
