package binaryTree;


public class BinarySearchUc1 {
	
		Node root;

		public BinarySearchUc1() {
			root = null;
		}

		void insert(int key) {
			root = insertRoot(root, key);
		}

		Node insertRoot(Node root, int key) {

			if (root == null) {
				root = new Node(key);
				System.out.println("The Node is created" + key);
				return root;
			}

			if (key < root.key) {
				System.out.println("Check the node is present or not");
				root.left = insertRoot(root.left, key);
				System.out.println(key + "value added");
			}

			else if (key > root.key) {
				System.out.println("Check the node is present or not");
				root.right = insertRoot(root.right, key);
				System.out.println(key + "value added");
			} else {

				return root;
			}

			return root;
		}

		boolean search(int key) {
			return searchRoot(root, key);
		}

		boolean searchRoot(Node root, int key) {

			if (root == null || root.key == key)
				return true;

			if (root.key > key)
				return searchRoot(root.left, key);

			return searchRoot(root.right, key);
		}
		
		int size() {
			  return sizeRec(root);
			}

			int sizeRec(Node node) {
			  if (node == null) {
			    return 0;
			  }
			  return 1 + sizeRec(node.left) + sizeRec(node.right);
			}


		public static void main(String[] args) {
			BinarySearchUc1 tree = new BinarySearchUc1();

			// Insert nodes into the BST
			tree.insert(56);
			tree.insert(30);
			tree.insert(70);
		}

	}


