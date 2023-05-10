# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None

    def addMany(self, values):
        current = self
        while current.next is not None:
            current = current.next
        for value in values:
            current.next = LinkedList(value)
            current = current.next
        return self

    def getNodesInArray(self):
        nodes = []
        current = self
        while current is not None:
            nodes.append(current.value)
            current = current.next
        return nodes


def reverseLinkedList(head):
    # set pointers
    p1=None
    p2=head
    p3=head.next

    #begin loop
    while True:
        p2.next = p1

        # check for being at end
        if p3 is None:
            return p2
        else:
            p1=p2
            p2=p3
            p3=p3.next


### helper functions from algoexpert.io


def TestCase1():
    print(f"Starting test case 1:\n--------------------------------------------")

    input = LinkedList(0).addMany([1, 2, 3, 4, 5])
    actual = reverseLinkedList(input).getNodesInArray()
    input = LinkedList(0).addMany([1, 2, 3, 4, 5]).getNodesInArray() # add this line to help with output/print
    expected = LinkedList(5).addMany([4, 3, 2, 1, 0]).getNodesInArray()
    
    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")

def TestCase2():
    print(f"Starting test case 2:\n--------------------------------------------")

    input = LinkedList(0).addMany(range(1, 25))
    actual = reverseLinkedList(input).getNodesInArray()
    input = LinkedList(0).addMany(range(1, 25)).getNodesInArray() # add this line to help with output/print
    expected = LinkedList(24).addMany(range(23, -1, -1)).getNodesInArray()
    
    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")



# Run test case
TestCase1()
TestCase2()


