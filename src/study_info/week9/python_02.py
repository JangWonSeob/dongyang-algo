# 대소문자 바꾸기

# CheRry
def toggleCase(inputStr2):
    result = ''
    arr = list(inputStr2)
    for i in range(len(arr)):
        result += chr(ord(arr[i]) ^ 32)
    return result


inputStr = input()
print('Original Input: ' + inputStr)
print('toggleCase Input: ' + toggleCase(inputStr))

