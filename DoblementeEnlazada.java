public class DoblementeEnlazada <E> extends SimplementeEnlazada <E>{

	
	protected NodoDoble <E> head = null;
	protected NodoDoble <E> tail = null;
	
	public DoblementeEnlazada(E v) {
		super(v);
		
	}
	

	public int size() {
		return cont;
	}
	
	public void addFirst(E value) { //
		head = new NodoDoble<E>(value) ;
		if (tail == null){
			tail = head; 
		}
		cont++;
	}
	
	public E removeFirst() {
		
		if (size()!=0){
			NodoDoble<E> temp = (NodoDoble<E>) head.getNext();
			NodoDoble<E> temp2 =(NodoDoble<E>) head;
			head = temp;
			return (E) temp2;
		}
		return null;
	}
	
	public void addLast(E value) { //
		tail = new NodoDoble <E> (value);
		cont ++;
	}
	
	public E removeLast() { //
		NodoDoble<E> temp = tail;
		tail = tail.getPrevious();
		if (tail == null){
			head = null;
		}
		else {
			tail.setNext(null);
		}
		cont --;
		return temp.getValor();
		
	}
	

	
	public E getFirst() {
		return head.getValor();
	}
	
	public E getLast() {
		return tail.getValor();
	}
	
	public boolean contains(E value) { 
		int i = 0;
		NodoDoble<E> temp = head;
		while (i<size()){
			if (temp.valor == value){
				return true;
			}
			else
			{
				temp = (NodoDoble<E>) temp.getNext();
			}
			i++;
		}
		
		return false;
	}


	
	
	
	

}