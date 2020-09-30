package controller;

public class ListaTemperatura {
  private int tamanho;
  private Temperatura inicio;

  public ListaTemperatura() {
    this.tamanho = 0;
    this.inicio = null;
  }

  public boolean verificarVazio(ListaTemperatura lista) {
    if(lista.getTamanho() == 0) {
      System.out.println("Lista vazia");
      return  true;
    }

    System.out.println("A lista possui dados");
    return false;
  }

  public void inserirComeco(ListaTemperatura lista, float graus) {
    int tamanho = lista.getTamanho();
    Temperatura novaTemperatura = new Temperatura();
    novaTemperatura.setGraus(graus);

    if(verificarVazio(lista)) {
      novaTemperatura.setProximo(null);
    } else {
      novaTemperatura.setProximo(lista.getInicio());
    }

    lista.setInicio(novaTemperatura);
    lista.setTamanho(tamanho + 1);
    System.out.println("Valor adicionado ao inicio lista");
  }

  public void inserirFinal(ListaTemperatura lista, float graus) {
    Temperatura novaTemperatura = new Temperatura();
    novaTemperatura.setGraus(graus);
    Temperatura auxiliar = lista.getInicio();

    if(verificarVazio(lista)) {
      lista.setInicio(novaTemperatura);
      novaTemperatura.setProximo(null);
    } else {
      while(auxiliar.getProximo() != null) {
        auxiliar = auxiliar.getProximo();
      }

      auxiliar.setProximo(novaTemperatura);
      novaTemperatura.setProximo(null);
    }

    lista.setTamanho(tamanho + 1);
    System.out.println("Valor adicionado ao fim da lista");
  }

  public void inserirPosicao(ListaTemperatura lista, float graus, int posicao) {
    Temperatura novaTemperatura = new Temperatura();
    novaTemperatura.setGraus(graus);
    Temperatura auxiliar = lista.getInicio();

    if(posicao > lista.getTamanho()) {
      System.out.println("Esta posição não existe");
      return;
    }

    if(posicao == 1) {
      lista.setInicio(novaTemperatura);
      novaTemperatura.setProximo(lista.getInicio());
    } else {
      for(int i = 1; i < posicao - 1; i++) {
        auxiliar = auxiliar.getProximo();
      }
      novaTemperatura.setProximo(auxiliar.getProximo());
      auxiliar.setProximo(novaTemperatura);

    }

    lista.setTamanho(tamanho + 1);
    System.out.println("Valor adicionado à lista");
  }

  public void deletarInicio(ListaTemperatura lista) {
    if(verificarVazio(lista)) {
      System.out.println("Não é possivel deletar, pois, a lista esta vazia");
      return;
    }

    Temperatura auxiliar = lista.getInicio().getProximo();
    lista.setInicio(auxiliar);

    lista.setTamanho(tamanho - 1);
    System.out.println("Valor removido do inicio lista");

  }

  public void deletarFinal(ListaTemperatura lista) {
    if(verificarVazio(lista)) {
      System.out.println("Não é possivel deletar, pois, a lista esta vazia");
      return;
    }

    Temperatura auxiliar = lista.getInicio();

    while(auxiliar.getProximo() != null) {
      auxiliar = auxiliar.getProximo();
    }
    auxiliar.setProximo(null);

    lista.setTamanho(tamanho - 1);
    System.out.println("Valor removido do final da lista");
  }

  public void deletarPosicao(ListaTemperatura lista, int posicao) {
    if(verificarVazio(lista)) {
      System.out.println("Não é possivel deletar, pois, a lista esta vazia");
      return;
    }

    if(posicao > lista.getTamanho()) {
      System.out.println("Esta posição não existe");
      return;
    }

    Temperatura anterior = lista.getInicio();

    for(int i = 1; i < posicao - 1; i++) {
      anterior = anterior.getProximo();
    }

    Temperatura auxiliar = anterior.getProximo();

    anterior.setProximo(auxiliar.getProximo());

    lista.setTamanho(tamanho - 1);
    System.out.println("Valor removido da lista");
  }

  public void mostar(ListaTemperatura lista) {
    if(verificarVazio(lista)) {
      System.out.println("A lista está vazia");
    }else {
      Temperatura auxiliar = lista.getInicio();
      System.out.println("\nA lista possui os seguintes valores:");
      for(int i = 0; i < lista.getTamanho(); i++) {
        System.out.println(auxiliar.getGraus());
        auxiliar = auxiliar.getProximo();
      }
    }
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public Temperatura getInicio() {
    return inicio;
  }

  public void setInicio(Temperatura inicio) {
    this.inicio = inicio;
  }

}
