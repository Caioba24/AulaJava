package PacoteJava;

import javax.swing.*;

public class MultipicaJOption {
 
 public static void main(String[] args) {
        double valor1, valor2, resultado;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Entre com o primeiro valor:");
        valor1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Entre com o segundo valor:");
        valor2 = Double.parseDouble(aux);

        resultado = Multiplica.Multiplica(valor1, valor2);

        JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é = " + resultado);
    }

}
   
