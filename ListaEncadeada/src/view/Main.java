package view;

import controller.ListaTemperatura;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    ListaTemperatura lista = new ListaTemperatura();
    int opc;
    int posicao;
    float graus;

    do {
      opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções\n1- Inserir no comeco\n2- Inserir no final\n" +
              "3- Iniserir em qualquer posição\n4- Deletar valor inicio da lista\n5- Deletar valor final da lista\n" +
              "6- Deletar em qualquer posição\n7- Mostrar lista\n8- Verificar vazio\n9- Encerrar aplicação"
      ));

      switch (opc) {
        case 1:
          graus = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser adicionar no inicio"));
          lista.inserirComeco(lista, graus);
          break;
        case 2:
          graus = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser adicionar no final"));
          lista.inserirFinal(lista, graus);
          break;
        case 3:
          posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição em que deseja inserir o valor"));
          graus = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser inserido"));
          lista.inserirPosicao(lista, graus, posicao);
          break;
        case 4:
          lista.deletarInicio(lista);
          break;
        case 5:
          lista.deletarFinal(lista);
          break;
        case 6:
          posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição em que deseja deletar o valor"));
          lista.deletarPosicao(lista, posicao);
          break;
        case 7:
          lista.mostar(lista);
          break;
        case 8:
          lista.verificarVazio(lista);
          break;
        case 9:
          JOptionPane.showMessageDialog(null, "Cabô o programa!");
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção Inválida");
          break;
      }

    } while (opc != 9);

  }
}
