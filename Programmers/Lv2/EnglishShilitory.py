def solution(n, words):
    passWord = [words[0]]
    answer = [0,0]
    cnt = 1
    for word in words[1:]:
        if word not in passWord and passWord[-1][-1]==word[0]:
            passWord.append(word)
            cnt=cnt+1
        else:
            if cnt+1%n == 0:
                answer[0] = n+1
                answer[1] = cnt//n
            else:
                answer[0] = cnt%n+1
                answer[1] = cnt//n+1
            break
    return answer