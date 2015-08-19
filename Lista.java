
/**
 * Esta es la clase lista que hace referenca a que es una Pila. 
 * Con esta clase se busca soloamente utilizar algunos m�todos
 * que est�n incluidos en la pila, dejando a un lado push y pop.
 * El objetivo de realizar esta clase abstracta es que habr� una
 * lista simplemente enlazada, doblemente enlazada y una ciruclar 
 * que luego el programa deber� selecionar para saber cual utilizar.
 *
 * @param <E>
 */
public abstract class Lista<E> extends Pila<E>{
	
	protected int cont=0;
	
	/**
	 * Con este m�todo se puede remover el �limo elemento 
	 * de la lista y eliminarlo. Luego el puntero apuntar� 
	 * al elemento inmediatamente anterior al eliminado
	 * @return el �ltimo elemento de la lsita
	 */
	public abstract E removeLast();
	
	/**
	 * Con este m�todo se agregar� un elemento al final de la
	 * lista. El puntero de cola apuntar� a este elemento si es
	 * requerido por el tipo de lista
	 * 
	 * @param value elemento agregado al final de la lista
	 */
	public abstract void addLast(E value);
	
	/**Este m�todo peromite obetener el ultimo valor de una lista sin
	 * necesidad de ser removido de dicha lista.
	 * 
	 * @return el ultimo valor
	 */
	public abstract E getLast();
	
	
	public abstract boolean contains(E value);

}