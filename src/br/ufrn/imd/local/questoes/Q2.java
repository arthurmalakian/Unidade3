package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.patricia.Tree;

import java.util.ArrayList;

/**
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

public class Q2 {
    public void start() {
        Tree tree = new Tree();
        ArrayList<String> array = new ArrayList<String>();

        tree.insert("anulado");
        tree.insert("anuência");
        tree.insert("análogo");
        tree.insert("alienado");
        tree.insert("apogeu");
        tree.insert("anular");
        tree.insert("arbitrário");
        tree.insert("ardiloso");
        tree.insert("audácia");
        tree.insert("algoz");
        tree.insert("audiencia");
        tree.insert("aliens");
        tree.insert("auspicioso");
        tree.insert("astúcia");
        tree.insert("aleatório");
        tree.insert("apologia");
        tree.insert("alegoria");
        tree.insert("alegria");
        tree.insert("ativista");
        tree.insert("ativo");
        tree.insert("afeto");
        tree.insert("analogia");
        tree.insert("alicerce");
        tree.insert("afetivo");
        tree.insert("alheio");
        tree.insert("alho");
        tree.insert("analítico");
        tree.insert("autóctone");
        tree.insert("automovel");
        tree.insert("afável");

        array = tree.searchPrefix("anal");
        if (array.isEmpty()) {
            System.out.println("acho nada nao");
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}