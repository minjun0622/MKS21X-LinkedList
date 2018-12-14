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
   Node x;
   for (int i = 0; i < length; i++) {
     x = new Node(length, end, start);
     return x.contains(value);
   }
 }
 public int indexOf(Integer value){

 }
 public Integer remove(int index) {

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
       x = (index, end, start)

     }
   }




 }

 public Integer set(int index, Integer value) {

 }
}
