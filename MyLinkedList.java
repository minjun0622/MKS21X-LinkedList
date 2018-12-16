public class MyLinkedList{
 private int length;
 private Node start,end;

 public MyLinkedList() {
   length = 0;
 }

 public int size() {
   return size;
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
}

 public void add(int index,Integer value){


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
   if (size() == 1) {
     start = null;
     end = null;
   }

 }
 public boolean remove(Integer value) {

 }
 public String toString() {
   if (size == 0) {
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
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException("Index less than 0, or greater than/equal to size.");
   }
   Node current = start;
   for (int x = 0; x < length; x++) {
     if (x = index){
       return start.getData();
     }
     else {
       x = (index, end, start);

     }
   }




 }

 public Integer set(int index, Integer value) {

 }
}
