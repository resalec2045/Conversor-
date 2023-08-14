package moneda;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Moneda {

    String []opcionesMoneda = {"Peso a Dolar", "Peso a Euro", "Peso a Libra", "Peso a Yen", "Peso a Won", "Dolar a Peso", "Euro a Peso", "Libra a Peso", "Yen a Peso", "Won a Peso"};

    public void menu() {
        double cantidad = 0;
        double resultado;
        String opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion", "Menu", JOptionPane.INFORMATION_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]).toString();
        try {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir"));
        } catch (Exception e) {
            opcion = "Error";
        }
        switch (opcion) {
            case "Peso a Dolar":
                resultado = pesoToDolar(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Peso a Euro":
                resultado = pesoToEuro(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Peso a Libra":
                resultado = pesoToLibras(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Peso a Yen":
                resultado = pesoToYen(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Peso a Won":
                resultado = pesoToWon(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Dolar a Peso":
                resultado = dolarToPeso(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Euro a Peso":
                resultado = euroToPeso(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Libra a Peso":
                resultado = LibraToPeso(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Yen a Peso":
                resultado = YenToPeso(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Won a Peso":
                resultado = WonToPeso(cantidad);
                showMessageDialog(null, resultado);
                break;
            case "Error":
                showMessageDialog(null, "Valor no valido");
                break;
            default:
                break;
        }
    }

    public double pesoToDolar(double pesos) {

        return pesos * 0.00025;

    }

    public double pesoToEuro(double pesos) {

        return pesos * 0.00023;

    }

    public double pesoToLibras(double pesos) {

        return pesos * 0.00020;

    }

    public double pesoToYen(double pesos) {

        return pesos * 0.037;

    }

    public double pesoToWon(double pesos) {

        return pesos * 0.34;

    }

    public double dolarToPeso(double dolares) {

        return dolares * 3963.32;

    }

    public double euroToPeso(double euros) {

        return euros * 4344.21;

    }

    public double LibraToPeso(double libras) {

        return libras * 4912.52;

    }

    public double YenToPeso(double yen) {

        return yen * 27.37;

    }

    public double WonToPeso(double won) {

        return won * 2.98;

    }


}
