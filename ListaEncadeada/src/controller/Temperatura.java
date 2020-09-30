package controller;

public class Temperatura {
  private float graus;
  private Temperatura proximo;

  public Temperatura() {

  }

  public float getGraus() {
    return graus;
  }

  public void setGraus(float graus) {
    this.graus = graus;
  }

  public Temperatura getProximo() {
    return proximo;
  }

  public void setProximo(Temperatura proximo) {
    this.proximo = proximo;
  }
}
