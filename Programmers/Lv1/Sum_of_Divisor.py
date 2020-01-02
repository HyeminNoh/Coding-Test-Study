'''
Lv1 - 약수의 합 문제
약수 특성을 생각해서 n/2의 약수만 확인 하면 성능을 향상 시킬 수 있다.
'''
def solution(n):
    return sum([i for i in range(1,n+1) if n%i==0])