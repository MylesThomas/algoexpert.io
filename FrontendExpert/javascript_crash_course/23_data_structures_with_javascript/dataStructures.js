class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    constructor(){
        this.head = null;
    }

    addStart(value) {
        const node = new Node(value);
        // const tempHead = this.head
        // this.head = node;
        // node.next = tempHead;
        node.next = this.head;
        this.head = node;
    }

    addEnd(value) {
        const node = new Node(value);
        // iterate and add at the end...
        let curr = this.head;

        if (curr == null) {
            this.head = node;
            return;
        }

        while (curr.next) {
            curr = curr.next;
        }

        curr.next = node;
    }
}

const list = new LinkedList();
list.addStart(1);
list.addStart(2);
list.addStart(3);
list.addStart(4);

list.addEnd(69);

console.log(list); // LinkedList {
//     head: Node { value: 4, next: Node { value: 3, next: [Node] } }
//   }

console.log(list.head); // Node {
//     value: 4,
//     next: Node { value: 3, next: Node { value: 2, next: [Node] } }
//   }

console.log(list.head.next.next.next.next); // Node { value: 69, next: null }

console.log(list.head.next.next.next.next.next); // null
