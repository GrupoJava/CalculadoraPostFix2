public class SimplementeEnlazada<E> implements listaEnlazada<E>{
	
	protected int cont;
	protected Nodo<E> head; //Primer elemento
	
	
	public SimplementeEnlazada(E v) {
		cont = 0;
		head = null;
		
		// TODO Auto-generated constructor stub
	}

	public int size() {
		return cont;
	}
	
	public void addFirst(E value) {
		head = new Nodo<E>(value) ;
		cont++;
	}
	
	public E removeFirst() {
		Nodo <E> temp = head;
		head = head.getNext();
		cont--;
		return temp.getValor();
	}
	
	public E removeLast() {
		Nodo <E> finger = head;
		Nodo <E> previous = null;
		while (finger.getNext() != null){ //fin de la lista
			previous = finger;
			finger = finger.getNext();
		}
		//finger = null o fin de la lista
		if (previous == null){
			head = null; //un elemento
		}
		else{ 
			previous.setNext(null);
		}
		cont--;
		return finger.getValor();
	}
	
	public void addLast(E value) {
		Nodo <E> temp = new Nodo <E> (value);
		if (head!=null){
			Nodo<E> finger = head;
			while (finger.getNext() != null){
				finger = finger.getNext();
			}
			finger.setNext(temp);
		}
		else head = temp;
		cont ++;
	}
	
	public E getFirst() {
		return head.getValor();
	}
	
	public E getLast() {
		Nodo <E> finger = head;
		Nodo <E> previous = null;
		while (finger.getNext() != null){ //fin de la lista
			previous = finger;
			finger = finger.getNext();
		}
		return previous.getValor();
	}
	
	public boolean contains(E value) {
		Nodo <E> finger = head;
		while (finger != null && !finger.getValor().equals(value)){
			
			finger = finger.getNext();
		}
		return finger != null;
	}


	
}