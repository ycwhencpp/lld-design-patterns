package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leafhash {
    public static void main(String[] args) {
        Node root = new Node("root1");

        Node leaf = new Node("leaf1");
        Node leaf2 = new Node("leaf2");

        Node root2 = new Node("root2", leaf, leaf2);

        Node leaf3 = new Node("leaf3");
        Node leaf4 = new Node("leaf4");

        root.addleft(root2);

        root2.addleft(leaf3);
        root2.addright(leaf4);

        HashMap<Node, List<Node>> realmap = new HashMap<>();

        dfs(root, null, realmap);

        System.out.println(realmap);

    }

    public static void dfs(Node node, Node parent, HashMap<Node, List<Node>> map) {
        if (node == null) {
            return;
        }
        if (parent != null) {
            List<Node> ls = map.getOrDefault(parent, new ArrayList<>());
            ls.add(node);
            map.put(parent, ls);
        }
        dfs(node.right, node, map);
        dfs(node.left, node, map);

    }

    public static class Node {
        String val;
        Node left;
        Node right;

        public Node(String val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public Node(String val, Node r, Node l) {
            this.val = val;
            this.left = r;
            this.right = l;
        }

        public void addleft(Node node) {
            this.left = node;
        }

        public void addright(Node node) {
            this.right = node;
        }
    }

}
