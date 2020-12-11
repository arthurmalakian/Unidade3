package br.ufrn.imd.local;

import br.ufrn.imd.local.patricia.Tree;

public class Main {
    public static void main(String[] args) {
        Tree patricia = new Tree();
        patricia.insert("rato");
        patricia.insert("roeu");
        patricia.insert("roupa");
        patricia.insert("rei");
        patricia.insert("roma");
        System.out.println(patricia.search("rato"));
        System.out.println(patricia.search("roeu"));
        System.out.println(patricia.search("roupa"));
        System.out.println(patricia.search("rei"));
        System.out.println(patricia.search("roma"));
        System.out.println(patricia.toString());
    }
}
