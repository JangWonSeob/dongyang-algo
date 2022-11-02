from collections import Counter

cnter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

print(cnter['blue'])
print(cnter['green'])
print(dict(cnter))
