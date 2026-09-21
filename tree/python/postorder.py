class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
    def postorder(self,root):
        if root != None:
            self.postorder(root.left)
            self.postorder(root.right)
            print(root.data, end=" ")
    # create nodes
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)

root.postorder(root)        
