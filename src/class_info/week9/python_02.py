# 대소문자 바꾸기
def toggleCase(str):
    arr = list(str)
    result = ''
    for i in range(len(arr)):
        result += chr(ord(arr[i]) ^ 32)
    return result


str = input()

print("original String: " + str)
print("toggleCase: " + toggleCase(str))

