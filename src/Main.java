import moneda.Moneda;
import temperatura.Temperatura;

import javax.swing.*;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {

        String []opciones = {"Conversor de moneda", "Conversor de temperatura"};

        String opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion", "Menu", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]).toString();

        int continuar = 0;

        do {
            switch (opcion) {
                case "Conversor de moneda":
                    Moneda moneda = new Moneda();
                    moneda.menu();
                    break;
                case "Conversor de temperatura":
                    Temperatura temperatura = new Temperatura();
                    temperatura.menu();
                    break;
                default:
                    break;
            }

            continuar = showConfirmDialog(null, "¿Deseas realizar otra operacion?", "Menu", JOptionPane.YES_NO_OPTION);
        } while (continuar == 0);

        showMessageDialog(null, "Programa finalizado");

    }
}