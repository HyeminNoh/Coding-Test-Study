# 튜플을 활용 했을 때 성능이 올라간다고 해 참고 후 수정
def check(result):
    for x,y,kind in result:
        if kind==0:
            if y==0 or (x-1,y,1) in result or (x,y,1) in result or (x,y-1,0) in result:
                continue
            else:
                return False
        elif kind==1:
            if (x,y-1,0)in result or (x+1,y-1,0) in result or ((x-1,y,1) in result and (x+1,y,1) in result):
                continue
            else:
                return False
    return True

def solution(n, build_frame):
    result=set()
    for a in build_frame:
        x,y,what,how=a

        if how==1:
            result.add((x,y,what))
            is_true=check(result)
            if is_true:
                continue
            else:
                result.remove((x,y,what))
        elif how==0:
            if (x,y,what) in result:
                result.remove((x,y,what))
                is_true=check(result)
                if is_true:
                    continue
                else:
                    result.add((x,y,what))
    result=[list(i) for i in result]
    return sorted(result, key=lambda x: (x[0],x[1],x[2]))