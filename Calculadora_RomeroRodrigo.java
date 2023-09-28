import java.util.Scanner;
public class Calculadora_RomeroRodrigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float resultado,num1, num2;
        boolean aux = true;             // Se inicializan las variables
        int  opcion = 1;
        while (opcion !=0){             // Se inicia el bucle de la calculadora para realizar operaciones seguidas.
            System.out.println("Ingrese que operacion desea realizar");
            System.out.println("1 Suma, 2 Resta, 3 Multiplicacion, 4 Division. Ingrese 0 para salir.");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    resultado = num1 + num2;
                    System.out.println("La suma de "+num1+" y "+num2+" es: "+resultado);    //Se realiza la suma
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    resultado = num1 - num2;
                    System.out.println("La resta de "+num1+" y "+num2+" es: "+resultado);   //Se realiza la resta
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion de "+num1+" y "+num2+" es: "+resultado);  //Se realiza la multiplicacion
                    break;
                case 4:
                    while (aux) {
                        System.out.println("Ingrese el primer numero");
                        num1 = sc.nextFloat();
                        System.out.println("Ingrese el segundo numero");
                        num2 = sc.nextFloat();
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por 0!");   //Se realiza la verificacion de no dividir por 0
                        } else {
                            resultado = num1 / num2;
                            System.out.println("La division de " + num1 + " y " + num2 + " es: " + resultado);  //Se realiza la division
                            aux = false;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Gracias por utilizar esta calculadora! Hasta pronto.");     //Se da un mensaje de despedida al salir
                    break;
                default:
                    System.out.println("Opcion incorrecta! Intente nuevamente");    //Se verifica que la opcion ingresada sea correcta

            }
        }
    }
}