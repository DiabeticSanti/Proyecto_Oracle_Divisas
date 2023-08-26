import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double [] divisas = {0.00025, 0.00023, 0.00020, 0.037, 0.34, 4000};
        //int opcionUsuario = mostrarMenu();
        String resultadoConversion = calcularConversion(2, 3, 2);
        JOptionPane.showMessageDialog(null, resultadoConversion);
    }




    //Muestra el menu de las divisas
    public static int mostrarDivisas() {
        int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("1. dolar \n 2. Euros \n 3. Libras Esterlinas \n 4. Yen Japonés \n 5. Won Sur-Coreano \n 6. Pesos Colombianos"));
        return opcionUsuario;
    }

    public static String calcularConversion(int opcionConversion ,int opcionUsuario , int valorConversion) {
        int resultado = 0;
        if (opcionConversion == 1) {
            resultado = opcionUsuario * valorConversion;
        }
        else {
            resultado = opcionUsuario / valorConversion;
        }
        return "el resultado de la conversion es: " + resultado;
    }

    //Muestra menu para elegir si el programa sigue o se detiene
    public static int mostrarMenu() {
        int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("1. Si \n 2. No \n 3. Cancelar"));
        return opcionUsuario;


    }

}

