public class NodoDoble<E> extends Nodo<E>{
	
	private NodoDoble<E> previous;
	
	
	public NodoDoble(E v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	public NodoDoble<E> getPrevious() {
		return previous;
	}
	public void setPrevious(NodoDoble<E> previous) {
		this.previous = previous;
	}	
}