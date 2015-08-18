public class DoblementeEnlazada <E> extends Lista <E>{

	protected NodoDoble <E> head = null;
	protected NodoDoble <E> tail = null;
	
	public DoblementeEnlazada() {
		cont = 0;
		head = null;
	}
	
	public int size() {
		return cont;
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
		if(head==null){
			head = new NodoDoble<E>(x) ;
		}else{
			tail=head;
			head= new NodoDoble<E>(x) ;
			head.setNext(tail);
			tail.setPrevious(head);
			
		}
		cont++;
	}

	@Override
	public E pop() throws Exception {
		
		if (head!=null && size()!=0){
			NodoDoble<E> temp;
			temp=head;
			head.setNext(null);
			head=tail;
			head.setPrevious(null);
			if(head.getNext()!=null){
				tail=(NodoDoble<E>) head.getNext();
			}
			cont--;
			return (E) temp.getValor();
		}
		cont--;
		return null;
	}

	@Override
	public E peek() throws Exception {
		return head.getValor();
	}
}