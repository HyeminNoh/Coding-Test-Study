# 2019 카카오 개발자 겨울 인턴십 > 크레인 인형뽑기 게임
def solution(board, moves):
    bucket = []
    answer = 0
    for yIdx in moves:
        for xIdx in range(len(board)):
            if board[xIdx][yIdx-1] != 0:
                bucket.append(board[xIdx][yIdx-1])
                board[xIdx][yIdx-1] = 0
                if len(bucket)>1 and bucket[-1]==bucket[-2]:
                    bucket.pop()
                    bucket.pop()
                    answer += 2
                break
    return answer