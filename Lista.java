public class Lista {

    private No inicio;

   public Lista(){
    inicio = null;

    }
// metodo de acesso

// verificar se a lista está vazia

public boolean estaVazia(){
    return(inicio == null);
}
//inserir na lista 

public void insereInicio(No novoNo){
    novoNo.setProximo(inicio);

    inicio = novoNo;
}
// remover da lista 
// exibir a lista


public String mostrarLista(){
    String saida = "Lista: ";
    No aux;

    aux = inicio;
    while (aux != null) {
        saida = saida + aux.getPessoa().getNome()+",";
        aux = aux.getProximo();
    }



return saida;


}
// tamanho da lista
// procurar na lista 


}


