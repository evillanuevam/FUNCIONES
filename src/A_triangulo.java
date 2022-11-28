import javax.swing.JOptionPane;
public class A_triangulo {

    public static void main(String[] Args) {
        //PEDIMOS LOS DATOS POR TECLADO
        String teclado = JOptionPane.showInputDialog("Introduzca base:");
        String teclado2 = JOptionPane.showInputDialog("Introduzca altura:");

        //CONVERTIMOS LO INGRESADO A DOUBLE, PARA PODER MOSTRAR DECIMALES
        double a = Double.parseDouble(teclado);
        double b = Double.parseDouble(teclado2);

        //MOSTRAMOS POR PANTALLA Y LLAMAMOS LA FUNCION
        //System.out.println("el area es: "+ area(x,y)); //mostrar en pantalla negra
        JOptionPane.showMessageDialog(null,"el area es: " + area(a,b));
    }

    //--------------FUNCIÓN DEL AREA----------------------------------- una funcion siempre tiene que retornar (sino no es una funcion)
    private static double area(double x, double y)
    {
        return (x * y)/2;
    }
}
