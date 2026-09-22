class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
    def inorder(self, root):
        if root != None:
            self.inorder(root.left)
            print(root.data, end=" ")
            self.inorder(root.right)
# crete nodes
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

root.inorder(root)
