public class MyLinkedList{
 private int length;
 private Node start,end;

 public MyLinkedList() {

 }

 public int size();

 public boolean add(int value);

 public String toString() {

 }

 public int get(int index) {
   if (index < 0 || index >= length) {
     throw new IndexOutOfBoundsException("Index less than 0, or greater than/equal to size.");
   }




 }

 public Integer set(int index, Integer value) {
   
 }
}
