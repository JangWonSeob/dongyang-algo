# 대소문자 바꾸기
def toggleCase(inputStr2):
    arr = list(inputStr2)
    result = ''
    for i in range(len(arr)):
        result += chr(ord(arr[i]) ^ 32)
    return result


inputStr = input()

print("original String: " + inputStr)
print("toggleCase: " + toggleCase(inputStr))

