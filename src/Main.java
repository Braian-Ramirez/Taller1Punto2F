import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contador,variable;
        double resultado,numero1, numero2, numero3;
        String operador;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Ingrese un valor númerico: ");
            numero1 = scan.nextDouble();
            System.out.println("Ingrese otro valor númerico: ");
            numero2 = scan.nextDouble();
            System.out.println("Ingrese otro valor númerico: ");
            numero3 = scan.nextDouble();
            System.out.println("Ingrese la cantidad de veces que desea operar los números ingresados: ");
            variable = scan.nextInt();

            for ( contador = variable ; contador >= 0 ; contador --) {
                System.out.println("Inserte el simbolo de la operación que desea realizar: ");
                operador = scan.nextLine();
                if(operador.equals("+")) {
                    resultado = numero1 + numero2 + numero3;
                    System.out.println("El resultado de la suma de los números ingresados es: " + resultado);
                }
                if(operador.equals("-")){
                    resultado = numero1 - numero2 - numero3;
                    System.out.println("El resultado de la resta de los números ingresados es: " + resultado);
                }
                if(operador.equals("*")){
                    resultado = numero1 * numero2 * numero3;
                    System.out.println("El resultado de la multiplicación de los números ingresados es: " + resultado);
                }
                if(operador.equals("/")){
                    resultado = numero1 / numero2 / numero3;
                    System.out.println("El resultado de la división de los números ingresados es: " + resultado);
                }
                if(operador.equals("%")){
                    resultado = numero1 % numero2 % numero3;
                    System.out.println("El resultado del modulo de los números ingresados es: " + resultado);
                }
            }
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}