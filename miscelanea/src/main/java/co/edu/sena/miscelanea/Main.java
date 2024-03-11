package co.edu.sena.miscelanea;


import java.util.Scanner;


public class Main {

    static double dato1;
    static double dato2;
    static double dato3;
    static double dato4;

    static Ejercicios ejercicios = new Ejercicios();
    static Scanner src = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Miscelánea de ejercicios");
            System.out.println("--Bienvenido al menu--");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("4. Arreglos");
            System.out.println("99. Salir");
            System.out.println("Por favor digite una opcion:");
            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    operadores();
                    break;
                case 2:
                    condicionales();
                    break;
                case 3:
                    Ciclos();
                    break;
                case 4 :

                    break;
                case 99:
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 99);

        menu.close();
    }
        public static void operadores(){

        
        
        System.out.println("Miscelánea de ejercicios");


        System.out.println("1.1 Calcular el área de un triángulo");
        Scanner src = new Scanner(System.in);


        System.out.println("Ingrese la base del triángulo: ");
        dato1= src.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        dato2= src.nextDouble();
        dato3= ejercicios.areaTriangulo(dato1, dato2);
        System.out.println("El área del triángulo es: " + dato3);

        //actividad #2

        System.out.println("1.2 suma de dos numeros");

        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();

        System.out.println("Ingrese el segundo numero ");
        dato2= src.nextDouble();

        dato3= ejercicios.suma(dato1, dato2);
        System.out.println("la suma es  " + dato3);

        //actividad #3

        
        System.out.println("1.3 numero elevado ");

        System.out.println("Ingrese el numero: ");
        dato1= src.nextDouble();

        dato2= ejercicios.multiplicacion(dato1 );
        System.out.println("el numero elevado es " + dato2);

        //actividad #4

        System.out.println("1.4 convercion euros a dolares ");

        System.out.println("Ingrese la cantidad de euros: ");
        dato1= src.nextDouble();

        dato3= ejercicios.convercion(dato1, dato2);
        System.out.println("su convercion es:  " + dato3);

        //actividad #5

        System.out.println("1.5 area de un cuadrado ");

        System.out.println("Ingrese el valor de un lado: ");
        dato1= src.nextDouble();

        dato2= ejercicios.areaCuadrado(dato1);
        System.out.println("el valor del area es:  " + dato2 );
        dato3= ejercicios.area2Cuadrado(dato1);
        System.out.println("el valor del perimetro es : " +dato3);

        //actividad #6

        System.out.println("1.6 area y volumen del cilindro ");

        System.out.println("Ingrese el radio del cilindro: ");
        dato1= src.nextDouble();

        System.out.println("ingrese la altura del cilindro");
        dato2= src.nextDouble();

        dato3= ejercicios.areaCilindro(dato1, dato2);
        System.out.println("el valor del area es:  " + dato3 );
        
        dato4= ejercicios.volumenCilindro(dato1, dato2);
        System.out.println("el valor del volumen es: " + dato4);

        //actividad #7 

        System.out.println("longitud y area de un ");

        System.out.println("Ingrese la longitud del circulo: ");
        dato1= src.nextDouble();

        dato2= ejercicios.areaCuadrado(dato1);
        System.out.println("Ingresa el area del circulo:  " + dato2 );
        dato3= ejercicios.area2Cuadrado(dato1);
        System.out.println("el valor del perimetro es : " +dato3);

        //actividad #8

        System.out.println("Promedio de 3 numeros");

        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();

        System.out.println("ingrese el segundo numero");
        dato2= src.nextDouble();

        System.out.println("ingrese el tercer numero");
        dato3= src.nextDouble();

        dato4= ejercicios.protres(dato1, dato2 , dato3);
        System.out.println("El promedio de los 3 nùmeros es:  " + dato4 );

      
    }
    public static void condicionales(){
         //condicionales 

        //actividad 1
        System.out.println("Bienvenid@ a condicionales" );
        System.out.println("Determina si el numero ingresado es positivo o negativo." );

        System.out.println("Ingrese un numero: ");
        dato1= src.nextDouble();
        String resultado = (String) ejercicios.posinega(dato1);
        System.out.println("El resultado es:" + resultado);
       
        //actividad 2 
        System.out.println("Determine cuan de los dos numeros es mayor y cual es menor.");

        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        dato2= src.nextDouble();
        resultado = ejercicios.maymen(dato1, dato2);
        System.out.println("El resultado es: " + resultado);

        //actividad 3 
        System.out.println("Determinar 3 numeros enteros positivos y que me arroje el menor y mayor de ellos.");

        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        dato2= src.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        dato3= src.nextDouble();
        resultado = ejercicios.positi(dato1,dato2,dato3);
        System.out.println("El resultado es: " + resultado);

        //actividad 4 
        System.out.println("Sumar si A es menor que B o sino restarlos.");

        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        dato2= src.nextDouble();
        resultado = ejercicios.calcularResultado(dato1, dato2);

        System.out.println("El resultado es: " + resultado);

        //actividad 5
        System.out.println("Encontrar el cociente entre A y B.");

        System.out.println("Ingrese el número A: ");
        dato1 = src.nextDouble();

        System.out.println("Ingrese el número B: ");
        dato2 = src.nextDouble();

        resultado = ejercicios.division(dato1, dato2);
        System.out.println("El resultado es: " + resultado);

        //actividad 6 

        System.out.println( "\n" + "1.6 MULTIPLICACION DE NUMEROS SI UNO ES NEGATIVO" + "\n");
        System.out.println(" * Ingrese el primer numero.");
        dato1 = src.nextDouble();
        System.out.println(" * Ingrese el segundo numero.");
        dato2 = src.nextDouble();
        resultado = ejercicios.sumaomultiplicacion(dato1, dato2);
        System.out.println(resultado);

        //actividad 7 
        System.out.println("Es año bisiesto si o no.");

        System.out.print("Ingrese el año que desea verificar: ");
        int year = src.nextInt();
        
        if (ejercicios.esBisiesto(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    public static void Ciclos(){

    }
      
}


