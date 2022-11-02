# ATM 기기 문제 - 모든 사람에 기다리는 시간 구하기
N = int(input())
P = list(map(int, input().split()))
result = 0

P.sort()

for i in range(len(P)):
    result += sum(P[0:i + 1])

print(result)
