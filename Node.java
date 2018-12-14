private class Node{
 private int data;
 private Node next,prev;

 public Node(Integer value, Node nex, Node pre) {
   data = value;
   next = nex;
   prev = pre;   
 }

private Node next(){
  return next;
}

private Node prev(){
  return prev;
}

private void setNext(Node other){
  next = other;
}

private void setPrev(Node other){
  prev = other;
}

private Integer getData() {
  return data;
}

private Integer setData(Integer i) {
  Integer temp = data;
  data = i;
  return temp;
}

public String toString() {
  return "" + data;
}
}
