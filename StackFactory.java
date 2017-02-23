
import java.util.Stack;

class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public iPila<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
            return new StackArrayList<E>(); //regresa ArrayList
        else if (entry.equals("V"))
            return new vector<E>(); //regresa Vector
        else if (entry.equals("LS"))
            return new Simple<E>();
        else if (entry.equals("LD"))
            return new vector<E>();
        else if (entry.equals("LC"))
            return new Circular<E>();
        else
            return new vector<E>();
   }
}