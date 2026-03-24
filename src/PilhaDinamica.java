public class PilhaDinamica {
    private No topo;

    public PilhaDinamica() {
        topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void push(int valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public int pop() {
        if (estaVazia()) {
            System.out.println("Erro: pilha vazia!");
            return -1;
        }

        int valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public int peek() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }

        return topo.valor;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }

        No atual = topo;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}