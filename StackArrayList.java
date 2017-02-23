import java.util.ArrayList;

public class StackArrayList<E> implements iPila<E>

{
	protected ArrayList<E> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

        @Override
	public void push(E p)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

        @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
