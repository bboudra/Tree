package treePackage;

/**
 * 
 * @author Ben Boudra
 * 
 * @param <E>
 */
public interface TreeIteratorInterface<E>
{
	/**
	 * This method will be in charge of returning the Iterator for preorder
	 * traversal.
	 * 
	 * 
	 * @return Iterator
	 */
	public Iterator<E> getPreorderIterator();

	/**
	 * This method will get the Iterator for Postorder traversal.
	 * 
	 * @return
	 */
	public Iterator<E> getPostorderIterator();
	
	/**
	 * This method will get the Iterator for Inorder Traversal.
	 * 
	 * @return Iterator
	 */
	public Iterator<E> getInorderIterator();

	/***
	 * This method will get the Iterator for The Levelorder traversal.
	 * 
	 * @return Iterator
	 */
	public Iterator<E> getLevelorderIterator();

}
