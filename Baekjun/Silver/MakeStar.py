def makeStar(starStr):
    matrix = []
    for i in range(3*len(starStr)):
        if i//len(starStr)==1:
            matrix.append(starStr[i%len(starStr)]+" "*len(starStr)+starStr[i%len(starStr)])
        else:
            matrix.append(starStr[i%len(starStr)]*3)
    return(list(matrix))

n = int(input())
cnt = 0
star = ["***", "* *", "***"]

while n//3!=1:
    n = n//3
    cnt += 1
for i in range(cnt):
    star = makeStar(star)

for i in star:
    print(i)