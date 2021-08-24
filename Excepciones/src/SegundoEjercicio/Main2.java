package SegundoEjercicio;

import javax.swing.JOptionPane;

public class Main2 {

    public static void main(String[] args) {

        int numero = 0, auxiliar = 0;

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Indique cuantos numeros desea ingresar:"));

        while (cantidad != 0) {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Debe ingresar un numero",
                        "Error en el dato ingresado", JOptionPane.ERROR_MESSAGE);

            } finally {

                if (numero > auxiliar) {

                    auxiliar = numero;
                }
            }

            cantidad--;
        }

        JOptionPane.showMessageDialog(null, "El numero mayor ingresado fue: " + auxiliar);
    }
}
