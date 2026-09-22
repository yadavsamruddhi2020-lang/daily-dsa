import heapq
heap = [3, 7, 4, 10, 20, 30]
min = heapq.heappop(heap)
print("removed minimum:", min)
print("heap after removing minimum:", heap)
