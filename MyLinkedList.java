public class MyLinkedList{
 int length;
 Node start,end;

 public MyLinkedList() {
   length = 0;
   //creates an empty list.
 }

 public int size() {
   return length;
   //returns the length
 }

 public boolean add(int value) {
   Node x;
   if (length == 0) {
   x = new Node(0, null, null);
   start = x;
   end = x;
   //there's only one node so it points to the same thing.
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
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException(/*"Index less than 0, or greater than/equal to size."*/);
   }
   Node x = new Node(value,null,null);
    if (index == 0){
      x.setNext(start);
      start.setPrev(x);
      start = x;
      length++;
      return;
      //if you're adding to the first element. make start equal to next and set start as prev.
    }
    if (index == length) {
      add(value);
      return;
    }
      //if index is equal to the length. We add to the end.
    else {
      Node current = getNthNode(index);
      //using the helper function.
      Node before = current.prev();
      //dedicate a node before.
      before.setNext(x);
      current.setPrev(x);
      x.setPrev(before);
      x.setNext(current);
      length++;
      return;
      //increment length.
    }
  }


 public boolean contains(Integer value){
   Node current = start;
   while (current != null) {
     if (current.getData() == value)
       return true;
     current = current.next();
     //if it contains, then it returns true.
   }
   return false;
 }

 public int indexOf(Integer value){
   if (contains(value)) {
     //first checks if it contains.
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
   if (index < 0 || index > length) {
     throw new IndexOutOfBoundsException(/*"Index is less than 0/index is greater or equal to length."*/);
   }
   Node current = getNthNode(index);
   if (end == current) {
     Node pre = current.prev();
     //if the node being removed is last,
     pre.setNext(null);
     end = pre;
     length--;
     //make the next node null and subtract length.
   }  else {
   if (current == start) {
     Node nex = current.next();
     nex.setPrev(null);
     start = nex;
     length--;
     //if the node wanted is in the beginning, get rid of it and subtract length.
   } else {
     Node pre = current.prev();
     Node nex = current.next();
     pre.setNext(nex);
     pre.setPrev(pre);
     length--;
     //make it so that we make two nodes, one in the front and one in the back of what we want to get rid of.
     //we just link them together to get rid of it! It disappears.
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
   //checking if the integer is even there and then remove it.


 public String toString() {
   if (length == 0) {
     return "[]";
     //basic
   }
   String result = "[";
   Node current = start;
   while (current.next() != null) {
     result += current.getData() + ", ";
     current = current.next();
 }
 //uses a while loop to span through all the nodes.
 result += current.getData() + "]";
 //combining
 return result;
}

 public Integer get(int index) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException(/*"Index less than 0, or greater than/equal to size."*/);
   }
   return getNthNode(index).getData();
   //uses the helper function to get the element at the node specified with index.
 }


 public Integer set(int index, Integer value) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException(/*"Index less than 0 or greater than/equal to size."*/);
   }
   Node old = getNthNode(index);
   //make an old integer, get as a temporary variable
   old.setData(value);
   //make the new where the old node used to be.
   return old.getData();
   //returns the one set.
 }

 public void extend(MyLinkedList other){
   if (other.size() != 0) {
     end.setNext(other.start);
     //set node a end to link to start of node b.
     other.start.setPrev(end);
     //set end of node a equal to start of node b.
     length += other.size();
     //length is length of a and b added together.
     end = other.end;
     //establishes a new end.
     other.length = 0;
     //set the length of other to 0.
   }

   //basically how this code works,
   //take the end of the first part of the list and
   //link it to the beginning of the second part of the list and add the length.

   //size of other is reduced to 0.
        //in O(1) runtime, move the elements from other onto the end of this
        //The size of other is reduced to 0
        //The size of this is now the combined sizes of both original lists
    }
}
