# 가장 오른쪽 0값의 비트를 1로 바꾼 값 찾기
import math


def getPosOfRightmostSetBit(inputInt):
    return int(math.log2(~inputInt & (inputInt + 1)))


def setRightmostUnsetBit(inputInt):
    if inputInt == 0:
        return 1
    if (inputInt & (inputInt + 1)) == 0:
        return inputInt
    return (1 << getPosOfRightmostSetBit(inputInt)) | inputInt


n = int(input())
print(setRightmostUnsetBit(n))
