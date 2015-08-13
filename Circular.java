public class Circular<E> implements listaEnlazada<E>{
	
	Nodo<E> ultimo = null;
	int cont;
	
	public Circular(){
		
		cont = 0;
		
	}
	
	public int size() {
		return cont;
	}
	
	public void addFirst(E value) {
		Nodo<E> temp = new Nodo<E>(value);
		
		if (ultimo == null){
			
			ultimo = temp;
			ultimo.setNext(ultimo);
			
		}
		else
		{
			temp.setNext(ultimo.getNext());
			ultimo.setNext(temp);
		}
		
		
		cont++;
	}
	
	public E removeFirst() {
		
		Nodo<E> temp;
		Nodo<E> temp2;
		temp2 = ultimo.getNext();
		temp =  ultimo.getNext().getNext();
		ultimo.setNext(temp);
		return (E) temp2;
	}
	
	public E removeLast() {
		
		Nodo<E> pointer = ultimo;
		while (pointer.getNext()!= ultimo){
			pointer = pointer.getNext();
		}
		
		Nodo<E> temp = ultimo;
		
		if (pointer == ultimo){
			ultimo = null;
		}
		else
		{
			pointer.setNext(ultimo.getNext());
			ultimo = pointer;
		}
		
		cont--;
		return (E) temp;
	}
	
	public void addLast(E value) {
	}
	
	public E getFirst() {
		
		if (cont!=0){
			return (E) ultimo.getNext();
		}
		
		return null;
	}
	
	public E getLast() {
		
		Nodo<E> pointer = ultimo;
		while (pointer.getNext()!= ultimo){
			pointer = pointer.getNext();
		}
		
		return (E) pointer;
	}
	
	public boolean contains(E value) {
		int i = 0;
		Nodo<E> temp = ultimo;
		while (i<cont){
			
			if (temp== value){ return true; }
			i++;
		}
		
		return false;
	}


	
}