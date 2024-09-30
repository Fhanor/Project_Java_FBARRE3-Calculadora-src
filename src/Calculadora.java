import java.util.Scanner;
public class Calculadora {

    double num1;
    double num2;
    int operacion;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num1 = num2;}
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite Primer Número\n");
        double num1 = teclado.nextDouble();

        System.out.println("Digite Segundo Número\n");
        double num2 = teclado.nextDouble();

        Scanner operacion=new Scanner(System.in);

        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");

    int seleccion= operacion.nextInt();

        switch (seleccion){
            case 1:
                double suma = (num1 + num2);
                System.out.println("Suma\n" + suma);
                break;

            case 2:
                double resta = (num1 - num2);
                System.out.println("Resta\n" + resta);
                break;

            case 3:
            double multiplica = (num1 * num2);
            System.out.println("Multiplicacion\n" + multiplica);
            break;

            case 4:
                double division = (num1 / num2);
                System.out.println("División\n" + division);
                break;

            default:
                System.out.println("Estoy Fuera");}

                                                   }
    }





