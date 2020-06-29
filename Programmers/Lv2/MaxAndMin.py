def solution(s):
    answer = ''
    s = list(map(int, s.split(" ")))
    return str(min(s))+" "+str(max(s))