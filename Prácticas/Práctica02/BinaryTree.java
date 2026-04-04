package Prácticas.Práctica02;

import Prácticas.Práctica01.Ejercicio08.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}


	@Override
	public String toString() {
		return this.getData().toString();
	}


	// Ejercicio 1
	public int contarHojas() {
	  if (isLeaf() && this.getData() != null) return 1;

		int hi = 0, hd = 0;
		if (hasLeftChild()) hi = this.leftChild.contarHojas();
		if (hasRightChild()) hd = this.rightChild.contarHojas();

		return hi + hd;
	}
  
	// Ejercicio 1
	public BinaryTree<T> espejo(){
    if (hasLeftChild()) this.leftChild = this.leftChild.espejo();
    if (hasRightChild()) this.rightChild = this.rightChild.espejo();

    BinaryTree<T> temp = this.leftChild;
    this.leftChild = this.rightChild;
    this.rightChild = temp;

    return this;
	}

	// Ejercicio 2
	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if (this.isEmpty()) System.out.println("Árbol vacio");
		if (n >= m) System.out.println("N debe ser MENOR que M");

		Queue<BinaryTree<T>> cola = new Queue<>();
		cola.enqueue(this);
		int nivel = 0;

		while (!cola.isEmpty()) {
			int size = cola.size();

			for (int i = 0; i < size; i++) {
				BinaryTree<T> v = cola.dequeue();

				if (nivel >= n && nivel <= m) System.out.println(v.getData());

				if (v.hasLeftChild()) cola.enqueue(v.leftChild);
				if (v.hasRightChild()) cola.enqueue(v.rightChild);
			}

			nivel++;
		}
  }
		
}



