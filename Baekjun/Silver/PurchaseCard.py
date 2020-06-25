import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
lst = [0] + lst

dp = [0 for i in range(n+1)]

for i in range(n + 1):
    for j in range(i + 1):
        dp[i] = max(dp[i], lst[j] + dp[i - j])

print(dp[n])