package calculadora;

import java.util.Scanner;

public class PruebaCalculadora {
    public static void main(String[] args) {
        
        int opcion;//Variable para indicar la operacion a realizar
        double a;//Variable para el primer numero
        double b;//Variable para el segundo numero
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calculadora aritmetica basica");
        System.out.println("Ingresa la operación que desean realizar de acuerdo a las siguientes opciones: ");
        System.out.printf("Teclea 1 para realizar una suma%nTeclea 2 para realizar una resta%n"
                + "Teclea 3 para realizar una multiplicación%nTeclea 4 para realizar una división%n"
                + "Tu opción: ");
        opcion=entrada.nextInt();//Optiene la opcion de la operacion a realizar
        
        System.out.print("Ingresa el primer numero ");
        a=entrada.nextDouble();//Optiene el primer numero a usar en la operacion
        
        System.out.print("Ingresa el segundo numero ");
        b=entrada.nextDouble();//Optiene el segundo numero a usar en la operacion
        
        Calculadora calc= new Calculadora();
        
        //Llama al metodo sumar
        if(opcion==1){
        calc.sumar(a,b);    
        }
        
        //Llama al metodo restar
        else if(opcion==2){
            calc.restar(a,b);
        }
        
        //Llama al metodo multiplicar
       else  if(opcion==3){
            calc.multiplicar(a,b);
        }
       
        //Llama al metodo dividir
       else if(opcion==4){
            
        }
        //Indica que la opcion ingresada no es valida
        else{
            System.out.println("La opcion ingresada no es valida");
        }
    }
}
