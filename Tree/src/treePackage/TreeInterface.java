package treePackage;

public interface TreeInterface<E>
{
	/**
	 * This method will get the data that is inside the root (current) node and
	 * return it.
	 * 
	 * @return
	 */
	public E getRootData();

	/**
	 * This method will find the height of the tree. (I haven't exactly worked
	 * out the details yet.
	 * 
	 * @return
	 */
	public int getHeight();

	/**
	 * This method will find the number of nodes in the tree and return them to
	 * the user
	 * 
	 * @return
	 */
	public int numberOfNodes();

	/**
	 * This method will determine whether the tree is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * This method will clear all of the data in the tree/subtree.
	 * 
	 */
	public void clear();

}
