package datastruc.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	static class MyNode {
		// "MyNode" class, har ek tree ki single node ko represent karengi
		int data;
		MyNode left;
		MyNode right;

		public MyNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

//mbt will have a function to build a tree which works recursively
	static class MyBinaryTree {
		// ta
		int idx = -1;

		public MyNode buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			MyNode newNode = new MyNode(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

		// to print the tree contents
		public static void preOrderPrint(MyNode root) {
			/*
			 * PreOrder traversal O(n) Root -> Left subtree -> Right subtree
			 */
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrderPrint(root.left);
			preOrderPrint(root.right);
		}

		public static void inOrderPrint(MyNode root) {
			/*
			 * In Order traversal O(n) Left subtree -> Root -> Right subtree
			 */
			if (root == null) {
				return;
			}
			inOrderPrint(root.left);
			System.out.print(root.data + " ");
			inOrderPrint(root.right);
		}

		public static void postOrderPrint(MyNode root) {
			/* Left -> Right -> Root */
		}

		public static void leverOrder(MyNode root) {
			/* Level order is BFS and rest all are DFS */
			if (root == null) {
				return;
			}
			Queue<MyNode> q = new LinkedList<>();
			q.add(root);
			q.add(null);

			while (!q.isEmpty()) {
				MyNode currNode = q.remove();
				if (currNode == null) {
					System.out.println();
					if (q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				} else {
					System.out.print(currNode.data + " ");

					if (currNode.left != null) {
						q.add(currNode.left);
					}
					if (currNode.right != null) {
						q.add(currNode.right);
					}
				}
			}
		}

		public static int countOfNodes(MyNode root) {
			/* to count no of nodes using recursion */
			if (root == null) {
				return 0;
			}
			int leftNodes = countOfNodes(root.left);
			int rightNodes = countOfNodes(root.right);
			return leftNodes + rightNodes + 1;
		}

		public static int sumOfNodes(MyNode root) {
			/* To calculate sum of all nodes is same as the count of allNodes as above */
			if (root == null) {
				return 0;
			}
			int sumLeft = sumOfNodes(root.left);
			int sumRight = sumOfNodes(root.right);
			return sumLeft + sumRight + root.data;

		}

		public static int heightOfTree(MyNode root) {
			if (root == null) {
				return 0;
			}
			int leftHeight = heightOfTree(root.left);
			int rightHeight = heightOfTree(root.right);

			int myHeight = Math.max(leftHeight, rightHeight) + 1;
			return  myHeight;
		}

	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

		MyBinaryTree tree = new MyBinaryTree();
		// yeha aayenga apne tree ka root, it represents our tree root.left.data . . .
		MyNode root = tree.buildTree(nodes);
//		System.out.println(root.data);
//		System.out.println(root.left.data+"      "+root.right.data);
//		tree.countOfNodes(root);
		System.out.println(tree.heightOfTree(root));

	}

}
