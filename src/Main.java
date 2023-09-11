import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcionConversion = Integer.parseInt(JOptionPane.showInputDialog("¿Como desea realizar la conversion? \n 1. COP - X moneda \n 2. X moneda - COP" ));

        int valorEntrada = ingresarValorEntrada();

        int opcionUsuario = mostrarDivisas();

        double resultadoConversion = calcularConversion(opcionConversion, opcionUsuario, valorEntrada);

        JOptionPane.showMessageDialog(null, "El resultado de la conversion es " + resultadoConversion);

        int opcionContinuar = continuarEjecucion();
    }

    //Muestra el menu de las divisas
    public static int mostrarDivisas() {
        int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("1. dolar \n 2. Euros \n 3. Libras Esterlinas \n 4. Yen Japonés \n 5. Won Sur-Coreano \n 6. Pesos Colombianos"));
        return opcionUsuario;
    }

    public static double calcularConversion(int opcionConversion ,int opcionUsuario , int valorConversion) {
        double [] divisas = {0.00025, 0.00023, 0.00020, 0.037, 0.34, 4000};
        double resultado = 0;
        if (opcionConversion == 1) {
            resultado = divisas[opcionUsuario-1] * valorConversion;
        }
        else {
            resultado = divisas[opcionUsuario-1] / valorConversion;
        }
        return resultado;
    }

    //Muestra menu para elegir si el programa sigue o se detiene
    public static int continuarEjecucion() {
        int opcionUsuario = JOptionPane.showConfirmDialog(null, "Si \n No \n Cancelar", "¿Desea continuar?", JOptionPane.YES_NO_CANCEL_OPTION);
        return opcionUsuario;
    }
    public static int ingresarValorEntrada() {
        int valorConversion = 0;
        String valorEntrada = JOptionPane.showInputDialog("Ingrese el valor a convertir");
        try {
            valorConversion = Integer.parseInt(valorEntrada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este campo solo recibe valores numericos. Intenta nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return valorConversion;
    }

}

