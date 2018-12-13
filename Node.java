private class Node{
 private int data;
 private Node next,prev;

 public Node(data) {
   data = this.data;
 }

private Node next(){
  return next;
}

private Node prev(){
  return prev;
}

private void setNext(Node other){

}
private void setPrev(Node other){

}
private Integer getData() {
  return data;
}

private Integer setData(Integer i) {

}

public String toString() {
  Node current = first_node;
while (current != null) {
  System.out.println(current.value());
  current = current.next();
}
}



}
