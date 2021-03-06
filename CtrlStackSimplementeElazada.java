import java.util.ArrayList;
import java.util.Vector;


/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 * @param <E>
 */

public class CtrlStackSimplementeElazada<E> extends AbstractPilas<E>{
private SimplementeEnlazada<E> list;
	
	public CtrlStackSimplementeElazada(){
		list = new SimplementeEnlazada<E>();
	}

	@Override
	/**
	 *podemos limpiar la pila con este metodo
	 *pre: lista puede o no contener datos
	 *post: Lista vacia
	 */
	public void empty() {
		// TODO Auto-generated method stub
		while(list.getFirst()!=null)
			list.removeFirst();
		
	}

	@Override
	/**
	 *puede colocar en la pila un valor determinado, mandarlo hacia abajo
	 *pre: recibe dato
	 *post: agrega dato a la lista
	 */
	public void push(E x) {
		// TODO Auto-generated method stub
		list.addFirst(x);
	}

	@Override
	/**
	 *puede sacar un elemento de la pila, lo manda haci arriba
	 *pre: retira el ultimo valor ingresado de la lista
	 *post: regresa el valor retirado de la lista
	 */
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	/**
	 *este provee el tama�o de la pila
	 *pre: cuanta cantidad de datos en la lista
	 *post: Devuelve cantidad de datos en la lista
	 */
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	/**
	 *se puede verficar el dato de hasta arriba
	 *pre: lee el ultimo valor ingresado
	 *post: devuelve el ultimo valor ingresado
	 */
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		if(list.size()>0){
			return list.getFirst();
			
		}
			
		return null;
	}

}
