package pt.ua.edp;
public class ListaLigada {

    private static class Node {
        public Node next;
        public int elem;

        public Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    private Node head;

    public ListaLigada() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Lista vazia\n";
        StringBuilder aux = new StringBuilder("Representação da lista ligada: \n");
        for (Node node = head; node != null; node = node.next) {
            aux.append(node != head ? "\t\t" : "");
            aux.append("[v: ").append(node.elem).append(" | n: ").append(node.next == null ? "..." : node.next.elem).append("]");
        }
        return aux.toString();
    }
    // Método para inserir um novo valor na lista mantendo a ordem ascendente
    public void insertSorted(int newValue) {
        // Criar um novo nó com o valor a ser inserido
        Node newNode = new Node(newValue);
        // Caso especial: lista vazia ou o novo valor é menor ou igual ao primeiro elemento
        if (isEmpty() || head.elem >= newValue) {
            newNode.next = head;
            head = newNode;
        } else {
            // Inicializar variáveis de controle
            Node current = head;
            while (current.next != null && current.next.elem < newValue) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Método para remover até count ocorrências de x da lista
    public boolean removeMultiple(int x, int count) {
        if (isEmpty() || count <= 0) {
            return false;
        }
        Node current = head;
        Node prev = null;
        int removedCount = 0;

        while (current != null && removedCount < count) {
            // Verificar se o elemento atual é igual a x
            if (current.elem == x) {
                if (prev == null) {
                    // Caso seja um nó no meio ou final
                    head = current.next;
                } else {
                    prev.next = current.next;
                    // Caso seja um nó no meio ou final
                }
                removedCount++;

            } else {
                // Avançar para o próximo nó
                prev = current;
            }
            // Avançar para o próximo nó
            current = current.next;
        }
        // Verificar se foram removidas exatamente count ocorrências
        return removedCount == count;
    }
}
