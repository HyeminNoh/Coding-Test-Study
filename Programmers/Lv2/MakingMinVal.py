def solution(A,B):
    answer = 0
    A.sort()
    B.sort(reverse=True)
    print(A)
    print(B)
    for i in range(len(A)):
        answer += A[i]*B[i]
    return answer