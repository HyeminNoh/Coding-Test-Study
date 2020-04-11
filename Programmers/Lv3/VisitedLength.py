def solution(dirs):
    x, y = [0, 0, -1, 1 ], [1, -1, 0, 0]
    d = {"U":0, "D":1, "L":2, "R":3}
    answer = 0
    visited = []
    position = (0,0)
    for cmd in dirs:
        i = d[cmd]
        new = (position[0]+x[i],position[1]+y[i])
        if abs(new[0]) > 5 or abs(new[1]) > 5: continue
        if (position,new) not in visited: 
            visited.append((position,new))
            visited.append((new,position))
            answer += 1
        position = new
    return answer