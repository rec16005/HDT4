
public class Doble<E> extends AbstractLista<E> implements iPila<E>{
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;


public Doble()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

    private Doble(E value, Doble<E> head, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list

{
   DoublyLinkedNode<E> temp = tail;
   /*tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();*/
   return null;
   
}
   


    @Override
    public int size() {
        return count;
    }

    @Override
    public void addFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(E p) {
        // construct a new element, making it head
   tail = new DoublyLinkedNode<E>(p, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
    }

    @Override
    public E pop() {
    DoublyLinkedNode<E> temp = tail;
    if(!isEmpty()){
        if(head.nextElement==null){
        head = null;
        tail = null;
    }
    else{
        tail = tail.previousElement;
        tail.nextElement = null;
    }}
    
    return (E)temp.value();
}}
