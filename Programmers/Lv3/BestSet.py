def solution(n, s):
    if n>s:
        return [-1]
    [por, rem] = divmod(s, n)
    ans = [por]*n
    for i in range(rem):
        ans[i] += 1
    return sorted(ans)