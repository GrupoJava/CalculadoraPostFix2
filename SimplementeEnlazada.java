public class SimplementeEnlazada<E> extends Lista<E>{
	
	private Nodo<E> head=null;
	public SimplementeEnlazada() {
		cont = 0;
		head = null;
		
		// TODO Auto-generated constructor stub
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

	@Override
	public void empty() {
		cont=0;
		head=null;
	}

	@Override
	public boolean isEmpty() {
		return cont==0;
	}

	@Override
	public void push(E x) {
		System.out.println("VALOR ENTRANDO"+x);
		Nodo<E> temporal = head;
		head = new Nodo<E>(x) ;
		head.setNext(temporal);
		cont++;
	}

	@Override
	public E pop() throws Exception {
		System.out.println(head);
		Nodo <E> temp = head;
		if(head!=null && head.getNext()!=null){
			head = head.getNext();
		}else{
			head=null;
		}
		cont--;
		return temp.getValor();
	}

	@Override
	public E peek() throws Exception {
		return head.getValor();
	}

	@Override
	public int size() {
		return cont;
	}


	
}