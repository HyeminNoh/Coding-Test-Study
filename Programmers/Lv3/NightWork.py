import heapq
def solution(n, works):
    if sum(works) < n: return 0
    heap = []
    for value in works:
        heapq.heappush(heap,(-value,value))
    print(heap)
    for i in range(n):
        update = heapq.heappop(heap)
        value = update[1] - 1
        heapq.heappush(heap,(-value,value))
    works = [num[1]**2 for num in heap]
    return sum(works)
