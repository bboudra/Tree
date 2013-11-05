package treePackage;

public interface BinaryTreeInterface<E> extends TreeInterface<E>,
		TreeIteratorInterface<E>
{
	/**
	 * sets this binary tree to a new one-node binary tree.
	 * 
	 * @param rootData
	 *            an object that is the data in the new tree's root.
	 * 
	 */
	public void setTree(E rootData);
	

	/**
	 * Sets this binary tree to a new binary tree.
	 * 
	 * @param rootData - An object that is the data in the new tree's root
	 * @param leftTree - The left subtree of the new tree
	 * @param rightTree - The right subtree of the new tree
	 */
	public void setTree(E rootData, BinaryTreeInterface<E> leftTree, BinaryTreeInterface<E> rightTree);
}
