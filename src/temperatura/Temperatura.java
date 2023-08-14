package temperatura;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Temperatura {

    String []opcionesMoneda = {"farengheit a celsius", "celsius a farengheit"};

    public void menu() {
        double temperatura = 0;
        double resultado;
        String opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion", "Menu", JOptionPane.INFORMATION_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]).toString();
        try {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la temperatura a convertir"));
        } catch (Exception e) {
            opcion = "Error";
        }
        switch (opcion) {
            case "farengheit a celsius":
                resultado = farengheitTocelsius(temperatura);
                showMessageDialog(null, resultado);
                break;
            case "celsius a farengheit":
                resultado = celsiusTofarengheit(temperatura);
                showMessageDialog(null, resultado);
                break;
            case "Error":
                showMessageDialog(null, "Valor no valido");
                break;
            default:
                break;
        }
    }

    private double farengheitTocelsius(double temperatura) {
        return ((temperatura-32) * (5/9));
    }

    private double celsiusTofarengheit(double temperatura) {
        return (temperatura * 9/5) + 32 ;
    }
}
