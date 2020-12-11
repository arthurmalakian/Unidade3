package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.patricia.Tree;

import java.util.ArrayList;

public class Q2 {
    public void start() {
        Tree tree = new Tree();
        ArrayList<String> array = new ArrayList<String>();

        tree.insert("amor");
        tree.insert("anuência");
        tree.insert("análogo");
        tree.insert("alienado");
        tree.insert("apogeu");
        tree.insert("abstrato");
        tree.insert("arbitrário");
        tree.insert("ardiloso");
        tree.insert("audácia");
        tree.insert("algoz");
        tree.insert("apático");
        tree.insert("ascensão");
        tree.insert("auspicioso");
        tree.insert("astúcia");
        tree.insert("aleatório");
        tree.insert("apologia");
        tree.insert("acepção");
        tree.insert("alusão");
        tree.insert("ativista");
        tree.insert("anseio");
        tree.insert("afeto");
        tree.insert("analogia");
        tree.insert("alicerce");
        tree.insert("abnegado");
        tree.insert("alheio");
        tree.insert("altruísmo");
        tree.insert("analítico");
        tree.insert("autóctone");
        tree.insert("adorno");
        tree.insert("afável");
        tree.insert("anacrônico");

        System.out.println(tree.search("amor"));
        System.out.println(tree.search("anuência"));
        System.out.println(tree.search("análogo"));
        System.out.println(tree.search("alienado"));
        System.out.println(tree.search("apogeu"));
        System.out.println(tree.search("abstrato"));
        System.out.println(tree.search("arbitrário"));
        System.out.println(tree.search("ardiloso"));
        System.out.println(tree.search("audácia"));
        System.out.println(tree.search("algoz"));
        System.out.println(tree.search("apático"));
        System.out.println(tree.search("ascensão"));
        System.out.println(tree.search("auspicioso"));
        System.out.println(tree.search("astúcia"));
        System.out.println(tree.search("aleatório"));
        System.out.println(tree.search("apologia"));
        System.out.println(tree.search("acepção"));
        System.out.println(tree.search("alusão"));
        System.out.println(tree.search("ativista"));
        System.out.println(tree.search("anseio"));
        System.out.println(tree.search("afeto"));
        System.out.println(tree.search("analogia"));
        System.out.println(tree.search("alicerce"));
        System.out.println(tree.search("abnegado"));
        System.out.println(tree.search("alheio"));
        System.out.println(tree.search("altruísmo"));
        System.out.println(tree.search("analítico"));
        System.out.println(tree.search("autóctone"));
        System.out.println(tree.search("adorno"));
        System.out.println(tree.search("afável"));
        System.out.println(tree.search("anacrônico"));

        array = tree.searchPrefix("anal");
        if (array.isEmpty()) {
            System.out.println("acho nada nao");
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}