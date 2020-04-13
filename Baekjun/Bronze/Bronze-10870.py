n = int(input())
x = 0
y = 1
if n!=0:
    for i in range(1, n):
        tmp = x+y
        x = y
        y = tmp
    print(y)
else:
    print(0)