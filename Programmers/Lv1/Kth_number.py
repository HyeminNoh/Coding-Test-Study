'''
Lv1 - K번째 수 문제
lambda를 활용하면 더 간단하게 표현 가능했음

def solution(array, commands):
    return list(map(lambda x:sorted(array[x[0]-1:x[1]])[x[2]-1], commands))
'''
def solution(array, commands):
    answer = []
    for i in commands:
        temp = array[i[0]-1:i[1]]
        temp.sort()
        answer.append(temp[i[2]-1])
    return answer
