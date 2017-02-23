public abstract class AbstractiPila<E>{
  public void push(E p){
    v.add(p);
  }

	public E pop(){
    E p = null;
		if (!isEmpty()) {
		    p = v.lastElement();
		    v.remove(v.size() - 1);}
		return p;
  }

	public boolean isEmpty(){
    return (v.isEmpty());
  }

}
