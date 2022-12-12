# 각 숫자의 최대값 구하기(방식 +,x)
str = input()
result = 0

for i in range(len(str)):
    x = int(str[i])
    if result < 1 or x < 1:
        result += x
    else:
        result *= x

print(result)