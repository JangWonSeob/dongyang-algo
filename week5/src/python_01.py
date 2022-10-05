dir = [[0, -1], [0, 1], [-1, 0], [1, 0]]
alpha = ['L', 'R', 'U', 'D']
result = [1, 1]
N = int(input())
arr = input().split(' ')

for i in range(len(arr)):
    for j in range(len(alpha)):
        if arr[i] == alpha[j]:
            if (result[0] < 2 and dir[j][0] < 0) or (result[0] > N - 1 and dir[j][0] > 0):
                result[0] += 0
            else:
                result[0] += dir[j][0]

            if (result[1] < 2 and dir[j][1] < 0) or (result[1] > N - 1 and dir[j][1] > 0):
                result[1] += 0
            else:
                result[1] += dir[j][1]

            break;

print(result)