'''
윈터코딩2019 - 멀쩡한 사각형 문제

문제를 이해하면 답을 구해내는 것은 간단했음
문제해설포스트: (포스팅예정)
'''
from math import gcd

def solution(w,h):
    return w*h - (w + h - gcd(w,h))