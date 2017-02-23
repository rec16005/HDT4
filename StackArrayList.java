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
  public void push(E p);

  @Override
  public E pop();

  @Override
  public boolean isEmpty();

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
