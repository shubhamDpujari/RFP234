package binaryTree;

public class BinarySearchTreeUc3 {
	
		Node root;

		public BinarySearchTreeUc3() {
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
			  return sizeRoot(root);
			}

			int sizeRoot(Node node) {
			  if (node == null) {
			    return 0;
			  }
			  return 1 + sizeRoot(node.left) + sizeRoot(node.right);
			}


		public static void main(String[] args) {
			BinarySearchTreeUc3 tree = new BinarySearchTreeUc3();

			// Insert nodes into the BST
			tree.insert(56);
			tree.insert(30);
			tree.insert(70);
			tree.insert(22);
			tree.insert(40);
			tree.insert(60);
			tree.insert(95);
			tree.insert(11);
			tree.insert(3);
			tree.insert(16);
			tree.insert(65);
			tree.insert(63);
			tree.insert(67);
			System.out.println("Size of tree: " + tree.size());
			System.out.println(tree.search(63));

			
		}

	}

}
