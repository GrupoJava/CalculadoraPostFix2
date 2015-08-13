public class Nodo<E> {
	
	protected E valor;
	protected Nodo<E> next;
	
	public Nodo(E v){
		valor = v;
		 
	}
	
	public void setNext(Nodo<E> E){
		next = E;
	}
	
	public Nodo<E> getNext(){
		return next;
	}
	
	public void setValor(E s){
		valor = s;
	}
	
	public E getValor(){
		return valor;
	}
}