N, M, V = map(int, input().split())

graph = [[0 for j in range(N + 1)] for i in range(N + 1)]
visited = [False for i in range(N + 1)]

arr = []

for i in range(M):
    x, y = map(int, input().split())
    graph[x][y] = graph[y][x] = 1


def dfs(a):
    visited[a] = True
    print(a, end=' ')
    for b in range(N + 1):
        if not visited[b] and graph[a][b] == 1:
            dfs(b)


def bfs(a):
    queue = [a]
    visited[a] = 0
    while queue:
        a = queue.pop(0)
        print(a, end=' ')
        for b in range(1, N + 1):
            if visited[b] and graph[a][b] == 1:
                queue.append(b)
                visited[b] = 0


dfs(V)
print()
bfs(V)
