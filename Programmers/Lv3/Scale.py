def solution(weight):

    weight = sorted(weight)
    answer = 1
    for w in weight:
        if answer >= w:
            answer += w
    return answer