step = [[-2, -1], [-2, 1], [2, -1], [2, 1], [-1, -2], [-1, 2], [1, -2], [1, 2]]
alpha = ["a", "b", "c", "d", "e", "f", "g", "h"]
input1, input2 = input()
count = 0

for i in range(len(alpha)):
    if input1 == alpha[i]:
        input1 = i + 1
        break

input1 = int(input1)
input2 = int(input2)

for i in range(len(step)):
    input1 += step[i][0]
    input2 += step[i][1]
    if (0 < input1 < 9) and (0 < input2 < 9):
        count += 1

    input1 += step[i][0] * -1
    input2 += step[i][1] * -1

print(count)
