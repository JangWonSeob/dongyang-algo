# Dfs
vis = [False] * 9
graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7],
]


def dfs(x):
    vis[x] = True
    print(x, end=' ')
    for i in graph[x]:
        if not vis[i]:
            dfs(i)


dfs(1)
