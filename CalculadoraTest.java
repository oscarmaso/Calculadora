import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * La clase de prueba CalculadoraTest.
 * @author  (Oscar Maso)
 * @version (Final Versión)
 */
public class CalculadoraTest
{
    /**
     * Default constructor for test class CalculadoraTest
     */
    
    Calculadora calculadora;


public CalculadoraTest()
    {

}

/**
* Sets up the test fixture.
*
* Called before every test case method.
*/
@Before
    public void setUp() throws Exception
    {
        calculadora = new Calculadora();
    }

/**
* Tears down the test fixture.
*
* Called after every test case method.
*/
@After
    public void tearDown() throws Exception
    {
    }
@Test
    public void suma(){
        // Caso 1:
        // Suma con dos numeros reales positivos
        calculadora.ponNum1(4); // Pedida Numero 1
        calculadora.ponNum2(3); // Pedida Numero 2
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(7, calculadora.resultadoReal(),0.1);
        
        // Caso 2: 
        // Suma con dos numeros reales negativos
        calculadora.ponNum1(-4); // Pedida Numero 1
        calculadora.ponNum2(-5); // Pedida Numero 2
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(-9, calculadora.resultadoReal(),0.1);
        
        // Caso 3:
        // Suma con el 0 como segundo operando
        calculadora.ponNum1(3.4);  // Pedida Numero 1
        calculadora.ponNum2(0);    // Pedida Numero 2
        calculadora.ponOperacion("SUMA"); //Invocamos la operacion SUMA
        calculadora.opera();
        assertEquals(3.4, calculadora.resultadoReal(),0.1);
        
        // Caso 4: 
        // Suma con el 0 la propiedad conmutativa
        calculadora.ponNum1(0);    // Pedida Numero 1
        calculadora.ponNum2(2.4);  // Pedida Numero 2
        calculadora.ponOperacion("SUMA"); //Invocamos la operacion SUMA
        calculadora.opera();
        assertEquals(2.4, calculadora.resultadoReal(),0.1);
        
        // Caso 5: 
        // Suma con los valores limite positivos del double
        calculadora.ponNum1(Double.MAX_VALUE);  // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE);  // Pedida Numero 2
        calculadora.ponOperacion("SUMA"); //Invocamos la operacion SUMA
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
        // Caso 6: 
        // Suma ponemos los valores limite negativos del double
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("SUMA"); //Invocamos la operacion SUMA
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
        // Caso 7:
        // Suma con los valores limite positivos y negativos
        calculadora.ponNum1(Double.MAX_VALUE);  // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("SUMA"); //Invocamos la operacion SUMA
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);  
    }
@Test
    public void resta(){
        // Caso 1:
        // Resta ponemos dos numeros reales 
        calculadora.ponNum1(1.2);    // Pedida Numero 1
        calculadora.ponNum2(5);      // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(-3.8, calculadora.resultadoReal(),0.1);
        
        // Caso 2:
        // Resta probamos que al cambiar los operandos
        calculadora.ponNum1(8);     // Pedida Numero 1
        calculadora.ponNum2(7.2);   // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(0.8, calculadora.resultadoReal(),0.1);
        
        // Caso 3:
        // Resta probamos el 0 de segundo numero
        calculadora.ponNum1(6); // Pedida Numero 1
        calculadora.ponNum2(0); // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(6, calculadora.resultadoReal(),0.1);
        
        // Caso 4: 
        // Resta probamos que al cambiar el 0 por el 4 cambia el resultado
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponNum2(6); // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(-6, calculadora.resultadoReal(),0.1);
        
        //Caso 5 resta al poner el valor limite positivo menos el negativo da infinto
        calculadora.ponNum1(Double.MAX_VALUE);  // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
       //Caso 6 resta poner valor limite  negativo menos el positivo es igual a menos infinito
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE);  // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
        //Caso 7 resta poner los valores limites negativos espera un 0 porque - -(-) = -+
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("RESTA"); //Invocamos la operacion RESTA
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
    }
@Test
    public void multiplicacion(){
        //Caso 1 multiplicacion dos numeros reales
        calculadora.ponNum1(3.1); // Pedida Numero 1
        calculadora.ponNum2(5);   // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(15.5, calculadora.resultadoReal(),0.1);
        
        //Caso 2 multiplicacion dos numeros reales invertidos y no cambia el resultado
        calculadora.ponNum1(6);     // Pedida Numero 1
        calculadora.ponNum2(3.2);   // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(19.2, calculadora.resultadoReal(),0.1);
        
        //Caso 3 multiplicacion por 0
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponNum2(9); // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        
        //Caso 4 multiplicacion por 0 invirtiendo valores y no cambia
        calculadora.ponNum1(4); // Pedida Numero 1
        calculadora.ponNum2(0); // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        
        //Caso 5 multiplicacion limite positivo por limite positivo espera infinito
        calculadora.ponNum1(Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
        //Caso 6 multiplicacion limite negativo por limite positivo espera menos infinito
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE);  // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
        //Caso 7 multiplicacion limite negativo por limite negativo espera
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("MULTIPLICA"); //Invocamos la operacion MULTIPLICACION
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
    }
@Test
    public void division(){
        //Caso 1 division entre dos reales
        calculadora.ponNum1(6); // Pedida Numero 1
        calculadora.ponNum2(2); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(3, calculadora.resultadoReal(),0.1);
        
        //Caso 2 division dos reales invertidos
        calculadora.ponNum1(5); // Pedida Numero 1
        calculadora.ponNum2(8); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(0.6, calculadora.resultadoReal(),0.1);
        
        //Caso 3 division 0 entre un divisor distinto a 0 espera 5
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponNum2(7); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        
        //Caso 4 division numero real entre 0 espera infinito
        calculadora.ponNum1(7); // Pedida Numero 1
        calculadora.ponNum2(0); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
       //Caso 5 division espera un 0
        calculadora.ponNum1(0);                 // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE);  // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        
       //Caso 6 division espera uno ya que se dividen dos valores iguales
        calculadora.ponNum1(Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(1.0, calculadora.resultadoReal(),0.1);
        
        //Caso 7 division se divide 0 entre 0 y no sale numero
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponNum2(0); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(Double.NaN, calculadora.resultadoReal(),0.1);
        
        //Caso 8 division negativo entre 0
        calculadora.ponNum1(-); // Pedida Numero 1
        calculadora.ponNum2(0);  // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        
        // Caso 9 division limite positivo entre limite negativo
        calculadora.ponNum1(Double.MAX_VALUE);  // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(-1.0, calculadora.resultadoReal(),0.1);
        
        //Caso 10 division limite negativo entre limite negativo
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("DIVIDE"); //Invocamos la operacion DIVISION
        calculadora.opera();
        assertEquals(1, calculadora.resultadoReal(),0.1);
    }
@Test
    public void raices(){
        //Caso 1 raices la raiz cuadrada de 8 es 2.8.
        calculadora.ponNum1(8); // Pedida Numero 1
        calculadora.ponNum2(2); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(2.8,calculadora.resultadoReal(),0.1);
        
        //Caso 2 raices espera un nan porque la funcion no deja raices negativas.
        calculadora.ponNum1(-32); // Pedida Numero 1
        calculadora.ponNum2(5);   // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(Double.NaN,calculadora.resultadoReal(),0.1);
        
        //caso3 raices la raiz cubica de 7 es 2.64.
        calculadora.ponNum1(7); // Pedida Numero 1
        calculadora.ponNum2(3); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(1.709,calculadora.resultadoReal(),0.1);
        
        //caso 4 raices la raiz cuadrada de 0 es 0.
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponNum2(2); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);
        
        //caso 5 raices espera un 1.
        calculadora.ponNum1(Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);
        
        //caso 6 raices espera un nan porque la funcion no deja raices negativas.
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(Double.NaN,calculadora.resultadoReal(),0.1);
        
        //caso 7 raices infinito porque 2 elevado a 1 entre 0(es infinito).
        calculadora.ponNum1(2); // Pedida Numero 1
        calculadora.ponNum2(0); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY,calculadora.resultadoReal(),0.1);
        
         //caso 8 raices espara un 1.
        calculadora.ponNum1(Double.MAX_VALUE);  // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("RAICES"); //Invocamos la operacion RAICES
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);


        
    }
@Test
    public void potencias(){
        //Caso 1 potencias numero positivo elevado al cuadrado
        calculadora.ponNum1(4); // Pedida Numero 1
        calculadora.ponNum2(2); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(16.0,calculadora.resultadoReal(),0.1);
        
        //Caso 2 numero positivo elevado a 0 igual a 1
        calculadora.ponNum1(2); // Pedida Numero 1
        calculadora.ponNum2(0); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);
        
        //Caso 3 potencias 0 elevado a 4 0
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponNum2(4); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);
        
        // Caso 4 potencias limite postivo elevado a limite positivo igual a infinito
        calculadora.ponNum1(Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY,calculadora.resultadoReal(),0.1);
        
        //Caso 5 potencias limite negativo elevado a otro negativo igual menos infinito
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);
        
        //Caso 6 potencias limite negativo elevado a otro positvo igual a infinito
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponNum2(Double.MAX_VALUE);  // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY,calculadora.resultadoReal(),0.1);
        
        //Caso 7 potencias limite positivo elevado a negativo igual a 0
        calculadora.ponNum1(Double.MAX_VALUE);  // Pedida Numero 1
        calculadora.ponNum2(-Double.MAX_VALUE); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);
        
        //Caso 8 potencias numero positivo elevado a exponente negativo es igual a elevado 1/3 da 0.125
        calculadora.ponNum1(2);  // Pedida Numero 1
        calculadora.ponNum2(-3); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(0.125,calculadora.resultadoReal(),0.1);
        
        //Caso 9 potencias numero negativo elevado a exp negativo igual a -0.125
        calculadora.ponNum1(-2); // Pedida Numero 1
        calculadora.ponNum2(-3); // Pedida Numero 2
        calculadora.ponOperacion("POTENCIAS"); //Invocamos la operacion POTENCIAS
        calculadora.opera();
        assertEquals(-0.125,calculadora.resultadoReal(),0.1);
    }
@Test
    public void logaritmos(){
        //Caso 1 logaritmos logartimo de 10 da 1 ya que 10 entre 10 1.
        calculadora.ponNum1(10); // Pedida Numero 1
        calculadora.ponOperacion("LOGARITMOS"); //Invocamos la operacion LOGARITMOS
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);
        
          //Caso 2 logaritmos metemos el 1 y nos sale un cero.
        calculadora.ponNum1(1); // Pedida Numero 1
        calculadora.ponOperacion("LOGARITMOS"); //Invocamos la operacion LOGARITMOS
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);v
        
          //Caso 3 logaritmos logaritmo de un decimal y nos sale un numero decimal que empieza por 0.
        calculadora.ponNum1(2.3); // Pedida Numero 1
        calculadora.ponOperacion("LOGARITMOS"); //Invocamos la operacion LOGARITMOS
        calculadora.opera();
        assertEquals(0.361727836,calculadora.resultadoReal(),0.1);
        
         //Caso 4 logaritmos da ese resulatdo ya que es un limite positivo.
        calculadora.ponNum1(Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponOperacion("LOGARITMOS"); //Invocamos la operacion LOGARITMOS
        calculadora.opera();
        assertEquals(308.25471555991675,calculadora.resultadoReal(),0.1);
        
          //Caso 5 logaritmos los logaritmos negativos no existen por lo que hay poner double NaN.
        calculadora.ponNum1(-Double.MAX_VALUE); // Pedida Numero 1
        calculadora.ponOperacion("LOGARITMOS"); //Invocamos la operacion LOGARITMOS
        calculadora.opera();
        assertEquals(Double.NaN,calculadora.resultadoReal(),0.1);
        
          //Caso 6 logaritmos menos infinito ya que es una indterminacion.
        calculadora.ponNum1(0); // Pedida Numero 1
        calculadora.ponOperacion("LOGARITMOS"); //Invocamos la operacion LOGARITMOS
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY,calculadora.resultadoReal(),0.1);

    }
@Test
    public void factoriales(){
        //Caso 1 factoriales da 24 porque 4 * 3 * 2 * 1
        calculadora.PonFactorial(4);
        calculadora.ponOperacion("FACTORIALES"); //Invocamos la operacion FACTORIALES
        calculadora.opera();
        assertEquals(24,calculadora.resultado());
        
        //Caso 2 factoriales da 0 
        calculadora.PonFactorial(0);
        calculadora.ponOperacion("FACTORIALES"); //Invocamos la operacion FACTORIALES
        calculadora.opera();
        assertEquals(0,calculadora.resultado());
        
        //Caso 3 factoriales maximo valor espera 0
        calculadora.PonFactorial(Integer.MAX_VALUE);
        calculadora.ponOperacion("FACTORIALES"); //Invocamos la operacion FACTORIALES
        calculadora.opera();
        assertEquals(0,calculadora.resultado());
        
        //Caso 4 factoriales espera 0 porque no acepta negativos
        calculadora.PonFactorial(-2);
        calculadora.ponOperacion("FACTORIALES"); //Invocamos la operacion FACTORIALES
        calculadora.opera();
        assertEquals(0,calculadora.resultado());
        
        //Caso 5 factoriales
        calculadora.PonFactorial(-Integer.MAX_VALUE);
        calculadora.ponOperacion("FACTORIALES"); //Invocamos la operacion FACTORIALES
        calculadora.opera();
        assertEquals(0,calculadora.resultado());
    }
}
