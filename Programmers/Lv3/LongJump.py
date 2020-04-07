def solution(n):
    table = dict()
    table[0] = 1
    table[1] = 1
    for i in range(2, n+1):
        table[i] = table[i-1]+table[i-2]
    return table[n]%1234567