# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def findLoop(head):
    # Write your code here.
    p1 = head.next
    p2 = head.next.next
    while p1 != p2:
        p1 = p1.next
        p2 = p2.next.next
    # they are now the same, so pointOfInteresection = p1 or =p2
    pointOfIntersection = p1
    
    # reset, putting 1 at beginning and 2 at pointOfIntersection
    p1 = head
    p2 = pointOfIntersection
    while p1 != p2:
        p1 = p1.next
        p2 = p2.next
    return p2


def TestCase1():
    print(f"Starting test case 1:\n--------------------------------------------")

    head = LinkedList(0)
    head.next = LinkedList(1)
    head.next.next = LinkedList(2)
    head.next.next.next = LinkedList(3)
    head.next.next.next.next = LinkedList(4)
    head.next.next.next.next.next = LinkedList(5)
    head.next.next.next.next.next.next = LinkedList(6)
    head.next.next.next.next.next.next.next = LinkedList(7)
    head.next.next.next.next.next.next.next.next = LinkedList(8)
    head.next.next.next.next.next.next.next.next.next = LinkedList(9)
    ## circle
    head.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next

    # set up expected output
    n = 5
    counter = 1
    current = head
    while counter < n:
        current = current.next
        counter += 1
    expected = current

    # get actual output
    actual = findLoop(head)

    # assert equal
    
    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\nactual = {actual.value}\nexpected = {expected.value}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\nactual = {actual.value}\nexpected = {expected.value}\n\nbools: {bools}\n")


# Run test case
TestCase1()



