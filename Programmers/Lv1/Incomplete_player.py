'''
해시 - 완주하지 못한 선수 문제

'참가자에서 완주자를 빼내면 되지 않나?'라고 생각해
collections모듈을 사용함(딕셔너리 형태의 객체를 만들어줌)
또한 문제에 완주하지 못한 선수는 단 한명이라는 조건이 있으므로
남은 값을 문자열형태로 전체 출력함
'''
import collections

def solution(participant, completion):
    return ''.join(list(collections.Counter(participant) - collections.Counter(completion)))
