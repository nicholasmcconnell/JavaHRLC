package com.nickdemos.java.binarytree;

public class Driver {

    public static void main(String[] args){
        try{
            Node tree = sample_tree();
//            Bfs.traversal(tree);
            Dfs.traversal(tree);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Node sample_tree(){

        Node tree = new Node("A",
                new Node("B",
                        new Node("C"), new Node ("D")),
                new Node( "E",
                        new Node ("F"), new Node ("G",
                        new Node("H"), null)));

        return tree;
    }

}
