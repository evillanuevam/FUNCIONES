import javax.swing.JOptionPane;
public class Fechas {
    // ingresar por teclado el mes y año y mosytrar el numero de dias que tiene el mes //clase 2
    public static void main(String[] args){
        //PEDIMOS QUE INGRESE EL MES Y AÑO POR TECLADO
        String teclado1 = JOptionPane.showInputDialog("Introduzca mes:");
        String teclado2 = JOptionPane.showInputDialog("Introduzca año:");
        //DECLARAMOS NUESTRAS VARIABLES
        int m = Integer.parseInt(teclado1);
        int a = Integer.parseInt(teclado2);
        int nd = 0;

        //condicion para mostrar el numero de dias del mes / fecha(mes,anyo,numdias) es la funcion que nos retorna el mnumero de dias.
        if (fecha(m,a,nd)!=0){
            JOptionPane.showMessageDialog(null, "el mes "+m+ " del año " +a+ " tiene " +fecha(m,a,nd)+ " días ");
        }

    }
    // Funcion para hallar los dias del mes
    private static int fecha(int mes, int anyo,int numDias)
    {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                if((anyo%4==0 && anyo%100!=0) || anyo%400==0){
                    numDias = 29;
                }
                else{
                    numDias = 28;
                }
                break;
            default:
                //System.out.println("\nEl mes " + mes + " es incorrecto.");
                JOptionPane.showMessageDialog(null,"el mes " +mes+ " es incorrecto");
                break;
        }
            return numDias; // retornamos el numero de dias para usar en nuestra clase
    }
    
}
