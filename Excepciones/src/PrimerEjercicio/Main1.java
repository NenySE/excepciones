package PrimerEjercicio;

import javax.swing.JOptionPane;

public class Main1 {

    public static void main(String[] args) {

        double radio = 0;

        try {

            radio = Integer.parseInt(JOptionPane.showInputDialog("Digite el radio del circulo para calcular su area:"));

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Solo es posible ingresar numeros, no letras",
                    "Error en el dato ingresado", JOptionPane.ERROR_MESSAGE);

        } catch (Exception general) {

            JOptionPane.showMessageDialog(null, "Dato incorrecto",
                    "Error en el dato ingresado", JOptionPane.ERROR_MESSAGE);

        } finally {

            JOptionPane.showMessageDialog(null, "El area del circulo es: " + radio * Math.pow(3.14, 2));
        }

    }
}
