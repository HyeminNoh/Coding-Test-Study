def solution(s):
    s = s.lstrip('{').rstrip('}').split('},{')
    
    tmp = []
    
    for i in s:
        tmp.append(i.split(','))
    
    tmp.sort(key = len)
    
    answer = []
    for i in tmp:
        for j in i:
            if int(j) not in answer:
                answer.append(int(j))

    return answer