public class Circular<E> extends Lista<E>{
	
	Nodo<E> ultimo = null;
	
	public Circular(){
		
		cont = 0;
		
	}
	
	public int size() {
		return cont;
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

	@Override
	public void empty() {
		cont=0;
		ultimo=null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return cont==0;
	}

	@Override
	public void push(E x) {
		Nodo<E> temp = new Nodo<E>(x);
		
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

	@Override
	public E pop() throws Exception {
		Nodo<E> temp;
		Nodo<E> temp2;
		temp2 = ultimo.getNext();
		temp =  ultimo.getNext().getNext();
		ultimo.setNext(temp);
		return (E) temp2.getValor();
	}

	@Override
	public E peek() throws Exception {
		if (cont!=0){
			return (E) ultimo.getNext().getValor();
		}
		
		return null;
	}

	public void addLast(E value) {
		
		
	}


	
}