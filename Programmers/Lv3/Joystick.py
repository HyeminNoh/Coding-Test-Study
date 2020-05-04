def solution(name):
    m = [ min(ord(c) - ord("A"), ord("Z") - ord(c) + 1)  for c in name  ]
    answer = 0
    where = 0

    while True:
        answer += m[where]
        m[where] = 0

        if sum(m) == 0:
            break

        left, right = (1, 1)

        while m[where - left] <= 0:
            left += 1
        while m[where + right] <= 0:
            right += 1

        answer += left if left < right else right
        where += -left if left < right else right

    return answer