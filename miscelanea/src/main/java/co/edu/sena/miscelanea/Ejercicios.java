package co.edu.sena.miscelanea;


public class Ejercicios {
    
    public double areaTriangulo(double d1, double d2) {
        return (d1 * d2) /2;
    }
    public double suma(double d1, double d2) {
        return (d1 + d2);

    }
    public double multiplicacion(double d1){
        return(d1*d1);
    }
    public double convercion(double d1,double d2){
        d2= 1.08;
        return (d1*d2);

    }

    public double areaCuadrado(double d1){
        return (d1*d1);
    }
    public double area2Cuadrado(double d1){
        return (d1*4);
    }
    public double areaCilindro(double d1, double d2){
        return (Math.PI*d1*(d1+d2));
    }
    public double volumenCilindro(double d1, double d2){
        return (Math.PI*d1*d1*d2);
    }
    public double protres(double d1 , double d2 , double d3){
        return (d1 + d2 + d3) / 3;
    
      }
    public String posinega(double d1) {
        return (d1 > 0) ? "El numero es positivo."  : (d1 < 0) ? "El numero es negativo."  : "El numero es cero.";
    }
    public String maymen(double d1, double d2) {
        return (d1 > d2) ? d1 + " Es mayor que " + d2 : (d1 < d2) ? d2 + " Es mayor que " + d1 : " Los dos son iguales. ";
    }
    public String positi(double d1, double d2, double d3) {
        return d1 > d2 && d1 > d3 ? d1 + " es mayor que " + d2 + " y " + d3 :d2 > d1 && d2 > d3 ? d2 + " es mayor que " + d1 + " y " + d3 :d3 > d1 && d3 > d2 ? d3 + " es mayor que " + d1 + " y " + d2 : "Los tres números son iguales.";
    }
    public String calcularResultado(double d1, double d2) {
        return (d1 < d2) ? " Se suma " + (d1 + d2) : " Se resta " + (d1 - d2);
    }
    public String division(double d1, double d2) {
        return d2 != 0 ? "El cociente de " + d1 + " entre " + d2 + " es: " + (d1 / d2) : "La división no es posible, no puedes dividir por cero";
    }
    public String sumaomultiplicacion(double dato1, double dato2) {
        double dato3;
        double dato4;

        if (dato1 < 0 || dato2 < 0) {
            dato3 = (dato1 + dato2);
            return "El resultado es: " + dato3;
        } else {
            dato4 = (dato1 * dato2);
            return "El resultado es: " + dato4;
        }
    }
    public boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

