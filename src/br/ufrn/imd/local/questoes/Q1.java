package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.patricia.Tree;

public class Q1 {
    public void start(){
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
