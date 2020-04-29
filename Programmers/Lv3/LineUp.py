import math

def solution(n, k):
    num = list(range(1, n+1))
    answer = []
    while n > 0:
        n -= 1
        p, r = divmod(k, math.factorial(n))
        if r == 0:
            p -= 1
        answer.append(num[p])
        num.remove(num[p])
        k = r
    return answer