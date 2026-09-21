class Node:
    def __init__(self, data):
        self.data=data
        self.left=None
        self.right=None
    def preorder(self,root):
        if root!=None:
            print(root.data,end=" ")
            self.preorder(root.left)
            self.preorder(root.right)

# create nodes
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)

root.preorder(root)
