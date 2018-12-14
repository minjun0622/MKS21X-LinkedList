private class Node{
 private int data;
 private Node next,prev;

public Node(Intger value) {
  data = value;
  //another constructor was made because it could give you a data but not anything else.
}
 public Node(Integer value, Node nex, Node pre) {
   data = value;
   next = nex;
   prev = pre;
   //constructor
 }

public Node next(){
  return next;
  //returns next
}

public Node prev(){
  return prev;
  //returns prev
}

private void setNext(Node other){
  next = other;
  //sets next
}

private void setPrev(Node other){
  prev = other;
  //sets prev
}

public Integer getData() {
  return data;
  //returns the data.
}

public Integer setData(Integer i) {
  Integer temp = data;
  data = i;
  return temp;
  //stores it a variable and switches up data and then returns the variable.
}

public String toString() {
  return " " + data;
}
}
