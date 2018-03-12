
/*
 * Calculadora de 2 numeros con las funciones de:
 *      Suma        -   Resta
 *      Multiplica  -   Divide
 *      Raices      -   Logaritmos
 *      Factoriales -   Potencias
 *      
 * @author (Oscar Maso)
 * @version (Calculadora Final)
 */

public class Calculadora
{
    private double num1;        //N. Decimales disponibles
    private double num2;        //N. Decimales disponibles
    private int factorial;      //N. Enteros para Las operaciones
    private double resultado;   //Double para el resultado de la Raiz
    private int rdo;            //Resultado del factorial (int)
    private Operacion op;       //Asociacion de el enum (Archivo Operacion)
    private int indice;
    /**
     * Constructor para objetos de clase Calculadora
     */
    public Calculadora()
    {
        // Iniciamos Variables
        num1 = 0;
        num2 = 0;
        factorial = 0;
        op=op.SUMA;

    }

    public void ponNum1(double n1)
    {
        // Llamamos a Num 1
        this.num1=n1;
    }

    public void ponNum2(double n2)
    {
        // Llamamos a Num 2
        this.num2=n2;
    }
    public void PonFactorial(int factorial){
        //Factorial que debe ser entero
        this.factorial=factorial;
    }
    public void opera()
    {
        switch(op){
            case SUMA:          //Operacion Suma
                resultado=num1+num2;
                break;
            case RESTA:         //Operacion Resta
                resultado=num1-num2;
                break;
            case MULTIPLICA:    //Operacion Multiplicaciones
                resultado=num1*num2;
                break;
            case DIVIDE:        //Operacion Division
                resultado= num1/num2;
                break;
            case RAICES:        //Operaciones Raiz (No negativos [Math.pow])
                resultado = Math.pow((double)num1,1/(double)num2); 
            case POTENCIAS:     //Operaciones Potencia
                resultado = (double)Math.pow(num1,num2);
                break;
            case LOGARITMOS:    //Operaciones Logaritmos (b. 10)
                resultado=Math.log10(num1);
                break;
            case FACTORIALES:   //Operaciones con factoriales 
          
                int a = 1;  
                while ( factorial!=1) {
                    a=a*factorial;
                    factorial--;
                }
                rdo=a;
                break;
        }
    }
    public void ponOperacion(String opera){
        switch(opera){

            case "SUMA":
                op=op.SUMA;
                break;
            case "RESTA":
                op=op.RESTA;
                break;
            case "MULTIPLICA":
                op=op.MULTIPLICA;
                break;
            case "DIVIDE":
                op=op.DIVIDE;
                break;
            case "RAICES":
                op=op.RAICES;
                break;
            case "POTENCIAS":
                op=op.POTENCIAS;
                break;
            case "LOGARITMOS":
                op=op.LOGARITMOS;
                break;
            case "FACTORIALES":
                op=op.FACTORIALES;
                break;
        }
    }
    public double resultadoReal()
    {
        //Resultado (double).
        return resultado;
    }
    public int resultado(){
        //Resultado Factoriales.
        return rdo;
    }
    public void muestraTodosResultados(){
    // Impresión De las soluciones a los casos 
        System.out.println("Num1="+Double.toString(num1)+" Num2=" + Double.toString(num2));
        System.out.println("Suma :" + Double.toString(num1+num2));
        System.out.println("Resta :"+ Double.toString(num1-num2));
        System.out.println("Multiplica :" + Double.toString(num1*num2));
        System.out.println("Divide :"+ Double.toString(num1/num2));
        System.out.println("Raiz:"+Integer.toString(num1,1/num2));
        System.out.println("Potencia:" +Integer.toString(base,exp));
        System.out.println("Logaritmo : " +Double.toString(Math.log10(num1)));
        System.out.println("Factorial:" +Integer.toString(factorial));
    }
}

