public abstract class Lista<E> extends Pila<E>{
	protected int cont=0;
	public abstract E removeLast();
	
	public abstract void addLast(E value);
	
	public abstract E getLast();
	
	public abstract boolean contains(E value);

}