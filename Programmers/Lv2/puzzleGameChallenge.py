#	[프로그래머스][PCCP 기출문제] 2번 - 퍼즐 게임 챌린지

def solution(diffs, times, limit):
    level = 1 # 숙련도
    maxLevel = max(diffs) # 최대 난이도
    answer = maxLevel
    
    # 이진탐색 활용
    while level <= maxLevel:
        curLevel = (level + maxLevel) // 2
        solvedTime = times[0] # diffs[0]은 항상 1이므로 첫 문제는 바로 해결 된다고 봄
        
        for i in range(1, len(diffs)):
            retry = max(0, diffs[i] - curLevel)
            solvedTime += (times[i] + times[i-1]) * retry + times[i]
        
        if solvedTime <= limit:
            answer = curLevel
            maxLevel = curLevel - 1 # while문이 정상적인 타이밍에 종료되도록 값 갱신
        else:
            level = curLevel + 1
    return answer
