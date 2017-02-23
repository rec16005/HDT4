/*
* @author Cristopher Sebastian Recinos Ramirez
* @author Andrea Maria Cordon Mayen
* @date 22/02/2017
*/

public abstract class AbstractLista<E> implements Lista<E>{
  public AbstractLista(){

  }

  public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }

}
