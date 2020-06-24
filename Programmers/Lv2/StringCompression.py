def solution(s):
    length = []
    result = ""
    
    if len(s) == 1:
        return 1
    
    for ran in range(1, len(s) // 2 + 1): 
        count = 1
        tempStr = s[:ran] 
        for i in range(ran, len(s), ran):
            if s[i:i+ran] == tempStr:
                count += 1
            else:
                if count == 1:
                    count = ""
                result += str(count) + tempStr
                tempStr = s[i:i+ran]
                count = 1

        if count == 1:
            count = ""
        result += str(count) + tempStr
        length.append(len(result))
        result = ""
    return min(length)