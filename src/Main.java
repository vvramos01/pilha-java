public class Main {
    public static void main(String[] args) {

        System.out.println("=== Teste Pilha Estática ===");
        PilhaEstatica pilhaEstatica = new PilhaEstatica(5);

        pilhaEstatica.push(10);
        pilhaEstatica.push(20);
        pilhaEstatica.push(30);

        pilhaEstatica.exibir();

        System.out.println("Removido: " + pilhaEstatica.pop());
        System.out.println("Topo atual: " + pilhaEstatica.peek());

        pilhaEstatica.exibir();

        System.out.println("\n=== Teste Pilha Dinâmica ===");
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.push(5);
        pilhaDinamica.push(15);
        pilhaDinamica.push(25);

        pilhaDinamica.exibir();

        System.out.println("Removido: " + pilhaDinamica.pop());
        System.out.println("Topo atual: " + pilhaDinamica.peek());

        pilhaDinamica.exibir();
    }
}