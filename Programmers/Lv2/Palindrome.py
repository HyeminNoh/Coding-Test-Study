def solution(s):
    answer = 0
    for i in range(len(s)):
        for j in range(1, len(s)+1-i):
            stand = s[i:i+j]
            reverse = stand[::-1]
            if stand == reverse and j > answer:
                answer = j

    return answer