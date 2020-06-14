def solution(board):
    width = len(board[0])
    height = len(board)
    for x in range(1,height):
        for y in range(1,width):
            if board[x][y] == 1:
                board[x][y] = min(board[x-1][y-1], min(board[x-1][y], board[x][y-1])) + 1
    return max([item for row in board for item in row])**2