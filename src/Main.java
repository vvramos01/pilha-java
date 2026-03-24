public class Main {
    public static void main(String[] args) {

        System.out.println("=== Teste Pilha Estática ===");
        PilhaEstatica pilhaEstatica = new PilhaEstatica(5);

        System.out.println("Empilhando elementos...");
        pilhaEstatica.push(10);
        pilhaEstatica.push(20);
        pilhaEstatica.push(30);

        pilhaEstatica.exibir();

        System.out.println("\nRemovendo elemento...");
        System.out.println("Removido: " + pilhaEstatica.pop());

        System.out.println("Topo atual: " + pilhaEstatica.peek());

        pilhaEstatica.exibir();


        System.out.println("\n============================\n");


        System.out.println("=== Teste Pilha Dinâmica ===");
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        System.out.println("Empilhando elementos...");
        pilhaDinamica.push(5);
        pilhaDinamica.push(15);
        pilhaDinamica.push(25);

        pilhaDinamica.exibir();

        System.out.println("\nRemovendo elemento...");
        System.out.println("Removido: " + pilhaDinamica.pop());

        System.out.println("Topo atual: " + pilhaDinamica.peek());

        pilhaDinamica.exibir();
    }
}
