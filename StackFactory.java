
import java.util.Stack;

class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public iPila<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else
      return new vector<E>(); //regresa Vector
   }
}