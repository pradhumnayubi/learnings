package march_7;

import java.util.*;


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}


class BinaryTree {
    static Node root;

    public void insert(Integer[] values) {
        if (values.length == 0)
            return;

        Queue<Node> queue = new LinkedList<>();
        root = new Node(values[0]);
        queue.add(root);

        for (int i = 1; i < values.length; i += 2) {
            Node currentNode = queue.poll();

            if (values[i] != null) {
                currentNode.left = new Node(values[i]);
                queue.add(currentNode.left);
            }

            if (i + 1 < values.length && values[i + 1] != null) {
                currentNode.right = new Node(values[i + 1]);
                queue.add(currentNode.right);
            }
        }
    }

    public void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    static Map<Node, Node> buildMap(Node root) {
        Map<Node, Node> parentMap = new HashMap<>();
        parentMap.put(root, null);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                parentMap.put(node.left, node);
                queue.add(node.left);
            }
            if (node.right != null) {
                parentMap.put(node.right, node);
                queue.add(node.right);
            }
        }
        return parentMap;
    }

    static int LCA(Node root, int n1, int n2) {

        Map<Node, Node> parentMap = buildMap(root);
        Node p = null, q = null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.data == n1) p = node;
            if (node.data == n2) q = node;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        Set<Node> ancestors = new HashSet<>();
        while (p != null) {
            ancestors.add(p);
            p = parentMap.get(p);
        }

        while (q != null) {
            if (ancestors.contains(q)) return q.data;
            q = parentMap.get(q);
        }

        return -1;
    }

    Node recursiveLCA(Node node, int n1, int n2){
        if(node == null) return null;
        if (node.data > n1 && node.data > n2)
            return recursiveLCA(node.left, n1, n2);

        if (node.data < n1 && node.data < n2)
            return recursiveLCA(node.right, n1, n2);

        return node;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the binary tree (enter 'null' for empty nodes):");
        String[] inputStr = scanner.nextLine().split(",");
        Integer[] input = new Integer[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            input[i] = inputStr[i].equals("null") ? null : Integer.parseInt(inputStr[i]);
        }

        BinaryTree tree = new BinaryTree();
        tree.insert(input);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.println("Enter p: ");
        int p = scanner.nextInt();
        System.out.println("Enter q: ");
        int q = scanner.nextInt();


        //use LCA for iterative approach
//        System.out.println("LCA of p & q is: "+LCA(root,p,q));

        Node ans = tree.recursiveLCA(root,p,q);
        System.out.println("LCA of p & q is "+ans.data);
    }
}

