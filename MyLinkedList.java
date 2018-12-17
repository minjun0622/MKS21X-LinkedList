public class MyLinkedList{
 private int length;
 private Node start,end;

 public MyLinkedList() {
   length = 0;
 }

 public int size() {
   return length;
 }

 public boolean add(int value) {
   Node x;
   if (length == 0) {
   x = new Node(0, null, null);
   start = x;
   end = x;
   //there's only one node so!
   length++;
   return false;
 }
 else {
   x = new Node(length, null, end);
   end.setNext(x);
   //gets the nodes to open up the null for new node.
   end = x;
   length++;
   return false;
 }
 return true;
}

private Node getNthNode(int value) {
  Node result = start;
  for (int i = 0; i < value; i++) {
    result = result.next();
  }
  return result;
}
//I knew I needed a way for me to flip nodes using a for loop. However, I couldn't use for loops for every function.
//So I found out about the idea of using a helper function from a friend!

 public void add(int index, Integer value){
   if (index < 0 || index > length) {
     throw new IndexOutOfBoundsException("Index less than 0, or greater than/equal to size.");
   }
   Node current;
   Node x = new Node(value, null, null);
   if (index == 0) {
     n.setPrev(null);
     n.setNext(getNthNode(0));
     start = n;
     length++;
   }
   else {
     Node next = getNthNode(index);
     Node prev = getNthNode(index - 1);
     n.setPrev(prev);
     n.setNext(next);
     prev.setNext(n);
     next.setPrev(n);
     length++;
   }
 }
 public boolean contains(Integer value){
   Node current = start;
   while (current != null) {
     if (current.value() = value) {
       return true;
     }
     current = current.next();
   }
   return false;
 }

 public int indexOf(Integer value){
   Node current = start;
   int index = 0;
   while (current != null) {
     if (current.next() == value) {
       return index;
     }
     current = current.next();
     //advances into the next array.
     index++;
   }
   return -1;
   //returns -1 if it's not in the nodes.
 }

 public Integer remove(int index) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException("Index is less than 0/index is greater or equal to length.")
   }
   Node n = getNthNode(index);
   Node prev, next;
   Integer old = n.getData();
   if (index == 0) {
      next = n.next();
      next.setPrev(null);
      start = next;
      length--;
    }
    else if (index == length-1) {
      prev = n.prev();
      prev.setNext(null);
      end = prev;
      length--;
    }
    else {
      prev = getNthNode(index-1);
      next = getNthNode(index+1);
      prev.setNext(next);
      next.setPrev(prev);
      length--;
    }
    return old;
  }

 }
 public boolean remove(Integer value) {
   if (contains(value)) {
     remove(indexOf(value));
     return true;
   }
   return false;
   }
   //Wow this method uses every other function and it's so simple!!

 public String toString() {
   if (length == 0) {
     return "[]";
   }
   String result = "["
   Node current = start;
   while (current != null) {
     result += current.getData() + ", ";
     current = current.next();
 }
 return result + current.getData() + "]";
}

 public Integer get(int index) {
   if (index < 0 || index >= length {
     throw new IndexOutOfBoundsException("Index less than 0, or greater than/equal to size.");
   }
   return getNthNode(index).getData();
 }


 public Integer set(int index, Integer value) {
   if ((index < 0 || index >= length) {
     throw new IndexOutOfBoundsException("Index less than 0 or greater than/equal to size.");
   }
   Integer old = get(index).value();

 }
}
