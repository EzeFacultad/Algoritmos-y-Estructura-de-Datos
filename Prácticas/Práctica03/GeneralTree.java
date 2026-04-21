package Prácticas.Práctica03;

import java.util.LinkedList;
import java.util.List;
import Prácticas.Práctica01.Ejercicio08.Queue;


public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data); // invoca al constructor GeneralTree(T data)
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	

	// =============================== EJERCICIO 03
	public int altura() {	 
		int valor = 0;
		if ( this.isEmpty() ) return valor;

		if ( this.isLeaf() ) return 1;

		if ( this.hasChildren() ) {
			List<GeneralTree<T>> children = this.getChildren();
			for ( GeneralTree<T> child : children ) {
				int aux = child.altura();
				if ( valor < aux ) valor = aux;
			}
		}

		return valor + 1;
	}
	
	public int nivel(T dato) {
		if ( this.isEmpty() ) return -1;

		if ( this.getData().equals(dato) ) return 1;
		
		if ( this.hasChildren() ) {
			List<GeneralTree<T>> children = this.getChildren();
			for ( GeneralTree<T> child : children ) {
				int aux = child.nivel(dato);

				if (aux != -1 ) return aux + 1;

			}
		}

		return -1;
	}

	public int ancho(){
		if ( this.isEmpty() ) return 0;

		Queue<GeneralTree<T>> cola = new Queue<>();
		cola.enqueue(this);

		int max = 0;

		while ( !cola.isEmpty() ) {
			int size = cola.size();
			max = Math.max(max, size);

			for ( int i = 0; i < size; i++ ) {
				GeneralTree<T> d = cola.dequeue();

				if ( d.hasChildren() ) {
					for ( GeneralTree<T> child : d.getChildren() ) {
						cola.enqueue(child);
					}
				}
			}
		}

		return max;
	}


	// =============================== EJERCICIO 05
	public boolean esAncestro(T a, T b) {
    if (this.isEmpty()) return false;

    // Si encontramos A, buscamos B en su subárbol
    if (this.getData().equals(a)) {
        return contiene(b);
    }

    // Si no es A, seguimos buscando en los hijos
    for (GeneralTree<T> child : this.getChildren()) {
        if (child.esAncestro(a, b)) {
            return true;
        }
    }

    return false;
	}

	// Método auxiliar para buscar un dato en el subárbol
	private boolean contiene(T dato) {
			if (this.getData().equals(dato)) return true;

			for (GeneralTree<T> child : this.getChildren()) {
					if (child.contiene(dato)) return true;
			}

			return false;
	}
}