import heapq
heap=[3,7,10,30,50,20]
result = heapq.heappushpop(heap, 6)
print("result:", result)
print("heap after pushpop:", heap)
