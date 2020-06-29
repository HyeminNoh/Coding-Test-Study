def solution(s):
    l = s.lower().split(' ')
    for i,w in enumerate(l):
        if len(w)<2:
            l[i] = w.upper()+' '
        else:
            l[i] = w[0].upper()+w[1:]+' '
    return ''.join(l)[:-1]