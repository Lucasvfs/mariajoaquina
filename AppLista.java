public class AppLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        No no;

        System.out.println("Lista está vazia ? :" + lista.estaVazia());
    
        no = new No(new Pessoa("maria", "12345"));
        lista.insereInicio(no);
        no = new No(new Pessoa("julio", "54321"));
        lista.insereInicio(no);
        no = new No(new Pessoa("pedro", "12453"));
        lista.insereInicio(no);

        System.out.println( lista.mostrarLista());
    
    
    }
}
