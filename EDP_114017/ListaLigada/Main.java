package pt.ua.edp;

public class Main {

    public static void main(String[] args) {
        // Declaração da lista
        ListaLigada l = new ListaLigada();

        // Apresentação do estado inicial
        System.out.print(l.toString());
        System.out.println(l.isEmpty());

        // Inserção de nós à lista
        l.insertSorted(1);
        l.insertSorted(33);
        l.insertSorted(2);
        l.insertSorted(11);
        l.insertSorted(5);
        l.insertSorted(2);
        l.insertSorted(3);
        l.insertSorted(4);
        l.insertSorted(22);

        // Apresentação da lista com nós
        System.out.println("Lista inicial: \n" + l);

        // Remover até 2 ocorrências do valor 2
        int valorParaRemover = 2;
        int quantidadeParaRemover = 2;
        boolean removidoComSucesso = l.removeMultiple(valorParaRemover, quantidadeParaRemover);

        if (removidoComSucesso) {
            System.out.println(String.format("Removidas %d ocorrências de %d: \n%s", quantidadeParaRemover, valorParaRemover, l));
        } else {
            System.out.println(String.format("Não foi possível remover %d ocorrências de %d. Lista: \n%s", quantidadeParaRemover, valorParaRemover, l));
        }
    }
}
