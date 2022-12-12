# 연결하여 만들 수 있는 가장 큰 수 찾기

def largestNumber(array):
    if len(array) == 1:
        return array[0]

    for i in range(len(array) - 1):
        for j in range(i + 1, len(array)):
            if array[j] + array[i] > array[i] + array[j]:
                array[i], array[j] = array[j], array[i]

    result = ''.join(array)
    if result == ('0' * len(result)):
        return '0'
    else:
        return result


arr = ['10', '68', '75', '7', '21', '12']
print(largestNumber(arr))
