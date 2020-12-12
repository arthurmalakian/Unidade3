package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.patricia.Tree;

import java.util.ArrayList;

public class Q2 {
    /*
     Para realizar a busca pelas palavras que têm
     a sequência de caracteres informada como prefixo,
     primeiramente:
     1) Criamos um array de strings que irá
     guardar o valor "traduzido" de todas as keys válidas.
     2) Se a árvore estiver vazia, é retornado o array vazio.
     3) Antes de começar a percorrer a árvore, é gerada uma key
     com o valor informado. (key = string do valor binário daquela
     palavra)
     4) Verifica se existe ao menos um nó folha que possua esta
     key como prefixo
     5) Caso exista, percorre a árvore novamente procurando pelo
     primeiro nó de decisão com index maior do que o comprimento
     da key
     6) A partir deste nó, é admitido que todos os nós folhas
     têm como prefixo a key que foi buscada. Então, continua
     percorrendo a árvore a partir deste nó, e sempre que encontra um
     nó folha, adiciona ele ao array que será retornado
     7) Retorna o array para exibição
     */
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