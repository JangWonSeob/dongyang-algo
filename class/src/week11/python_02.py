## 문자열 압축

# inputStr = 'ababcdcdababcdcd'
inputStr = input()
result = inputStr

for i in range(1, len(inputStr) // 2 + 1):
    tmpResult = ''
    current = inputStr[0:i]
    count = 1
    for j in range(i, len(inputStr), i):
        if current == inputStr[j: j + i]:
            count += 1
        else:
            tmpResult += current if count < 2 else (str(count) + current)
            current = inputStr[j: j + i]
            count = 1

    tmpResult += current if count < 2 else (str(count) + current)
    if len(tmpResult) < len(result):
        result = tmpResult

# print(result)
print(len(result))


