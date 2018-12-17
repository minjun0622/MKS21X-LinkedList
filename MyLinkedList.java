public class MyLinkedList{
 int length;
 Node start,end;

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
   return true;
 }
 else {
   x = new Node(length, null, end);
   end.setNext(x);
   //gets the nodes to open up the null for new node.
   end = x;
   length++;
   return true;
 }
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
     throw new IndexOutOfBoundsException(/*"Index less than 0, or greater than/equal to size."*/);
   }
   Node x = new Node(value,null,null);
    if(index == 0){
      x.setNext(start);
      start.setPrev(x);
      start = x;
      length++;
    } else {
      Node current = getNthNode(index);
      Node before = current.prev();
      before.setNext(x);
      current.setPrev(x);
      x.setPrev(before);
      x.setNext(current);
      length++;
    }
  }

 public boolean contains(Integer value){
   Node current = start;
   while (current != null) {
     if (current.getData() == value)
       return true;
     current = current.next();
   }
   return false;
 }

 public int indexOf(Integer value){
   if (contains(value)) {
     Node current = start;
     int index = 0;
   while (current.getData() != value) {
    index++;
    //if it's not the value then just move to next node.
    current = current.next();
   }
   return index;
 }
 return -1;
   //returns -1 if it's not in the nodes.
 }

 public Integer remove(int index) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException(/*"Index is less than 0/index is greater or equal to length."*/);
   }
   Node current = getNthNode(index);
   if (end == current) {
     Node pre = current.prev();
     pre.setNext(null);
     end = pre;
     length--;
     return current.getData();
   }  else {
   if (current == start) {
     Node nex = current.next();
     nex.setPrev(null);
     start = nex;
     length--;
   } else {
     Node pre = current.prev();
     Node nex = current.next();
     pre.setNext(nex);
     pre.setPrev(pre);
     length--;
   }
 }
   return current.getData();
 }

 private boolean remove(Integer value) {
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
   String result = "[";
   Node current = start;
   while (current.next() != null) {
     result += current.getData() + ", ";
     current = current.next();
 }
 result += current.getData() + "]";
 return result;
}

 public Integer get(int index) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException(/*"Index less than 0, or greater than/equal to size."*/);
   }
   return getNthNode(index).getData();
 }


 public Integer set(int index, Integer value) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException(/*"Index less than 0 or greater than/equal to size."*/);
   }
   Integer old = getNthNode(index).getData();
   getNthNode(index).setData(value);
   return old;
 }
}
