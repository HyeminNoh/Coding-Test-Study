def checkIdx(p):
    num = 0
    temp = []
    for idx, value in enumerate(p):
        if value == ")":
            num -=1
        if value == "(":
            num +=1
        if num == 0:
            return idx

def isRight(p):
    check = []
    for l in p:
        if l=='(':
            check.append(l)
        else:
            if len(check)==0:
                return False
            check.pop()
    if len(check)!=0:
        return False
    return True

def solution(p):
    if p == "" or isRight(p): return p
    u, v = p[:checkIdx(p)+1], p[checkIdx(p)+1:]
    if isRight(u):
        string = solution(v)
        return u + string
    else:
        tmp = '('
        tmp+=solution(v)
        tmp+=')'
        u=list(u[1:-1])
        for i in range(len(u)):
            if u[i] == '(':
                u[i] = ')'
            elif u[i] == ')':
                u[i] = '('
        tmp+="".join(u)
        
        return tmp