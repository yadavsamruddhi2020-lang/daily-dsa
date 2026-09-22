import heapq

heap = [3, 7, 4, 10, 20, 30]

heapq.heapify(heap)

min = heapq.heappush(heap,6)

print("Minimum:", min)
print("Heap:", heap)
