import java.util.Vector;
public class vector<E> implements iPila<E> {
	
	private Vector <E> v=new Vector <E>(1);
	
	@Override
	public void push(E p) {
		v.add(p);
		
	}

	@Override
	public E pop() {
		E p = null;
		if (!isEmpty()) {
		    p = v.lastElement();
		    v.remove(v.size() - 1);}
		return p;
	}

	@Override
	public boolean isEmpty() {
		return (v.isEmpty());
	}

	

}
