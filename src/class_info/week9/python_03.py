# 대소문자 바꾸기
import math


def getPosOfRightmostSetBit(n):
    return int(math.log2(~n & (n + 1)))


def setRightmostUnsetBit(n):
    if n == 0:
        return 1
    if (n & (n + 1)) == 0:
        return n
    return (1 << getPosOfRightmostSetBit(n)) | n


n = int(input())

print(setRightmostUnsetBit(n))
