def solution(n):
    answer = [0]
    for i in range(n-1):
        answer = answer+[0]+reverse(answer)
    return answer

def reverse(array):
    returnValue = []
    for v in array:
        if v == 0:
            returnValue.append(1)
        elif v==1:
            returnValue.append(0)
    return list(reversed(returnValue))