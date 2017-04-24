
 package calculadora;

public class Calculadora {
    public void sumar(double a, double b){
        double c;
        c=a+b;
        System.out.println("a+b="+c);
    }
    public void restar(double a, double b){
        double c;
        c = a - b;
        System.out.printf("La resta de %.2f menos %.2f es igual a %.2f %n", a, b, c);
    }
    public void multiplicar(double a, double b){
        double result;
        
        result = a*b;
        System.out.println("resultado = " + result);
        
    }
    public void dividir(){
        
    }
}
