import re

# 우선 순위 생성
def makePriority(idx, uniqueOp, priority, visited, tmp):
    # 마지막까지 왔다면 수식 추가
    if idx == len(uniqueOp):
        priority.append(tmp[:])
        return
    # 반복문을 돌면서 추가
    for i in range(len(uniqueOp)):
        if visited[i] == 0:
            visited[i] = 1
            tmp.append(uniqueOp[i])
            makePriority(idx+1, uniqueOp, priority, visited, tmp)
            tmp.pop()
            visited[i] = 0

def solution(expression):
    # 연산
    operator = re.findall('r\d+|[+/*-]', expression)
    uniqueOp = list(set(operator))
    visited = [0]*len(uniqueOp)
    priority = []
    # 연산 우선순위 리스트
    makePriority(0, uniqueOp, priority, visited, [])
    # 전체 식
    ex = re.split(r'(\D)',expression)
    # 정답
    tmpResult = []
    for priOp in priority:
        tmpEx = ex[:]
        for op in priOp:
            while op in tmpEx:
                tmpIdx = tmpEx.index(op)
                tmpEx[tmpIdx-1] = str(eval(tmpEx[tmpIdx-1]+tmpEx[tmpIdx]+tmpEx[tmpIdx+1]))
                tmpEx = tmpEx[:tmpIdx]+tmpEx[tmpIdx+2:]
        tmpResult.append(abs(int(tmpEx[-1])))
    return max(tmpResult)