package controller;

public class Temperatura {

    private float graus;
    private controller.Temperatura proximo;

    public Temperatura() {

    }

    public float getGraus() {
      return graus;
    }

    public void setGraus(float graus) {
      this.graus = graus;
    }

    public controller.Temperatura getProximo() {
      return proximo;
    }

    public void setProximo(controller.Temperatura proximo) {
      this.proximo = proximo;
    }

}
