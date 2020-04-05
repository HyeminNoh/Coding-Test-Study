def solution(s):
    answer = True
    flag = 0
    for v in s:
        if flag <0:
            break
        if v=="(":
            flag += 1
        else:
            flag-=1
    if flag==0:
        return True
    else:
        return False