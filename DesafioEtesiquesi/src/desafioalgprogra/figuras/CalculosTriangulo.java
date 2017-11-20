
package desafioalgprogra.figuras;

/**
 *
 * @author Ratita
 */
public class CalculosTriangulo {
     public double calcularLado(double x1, double y1, double x2, double y2) {
        double lado = (double) Math.abs(Math.sqrt ( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)  ));
        return lado;
     }

    public double calcularperimetro(double lado_a, double lado_b, double lado_c) {
        double perimetro = (lado_a + lado_b + lado_c);
        return perimetro;
    }

    public double calcularArea(double lado_a, double lado_b, double lado_c) {
        double semiperimetro = (lado_a + lado_b + lado_c)/2; 
        double areaTriangulo = (double) Math.sqrt(semiperimetro * (semiperimetro - lado_a) * (semiperimetro - lado_b) * (semiperimetro - lado_c)); // sacamos el area utilizando la formula de heron
        return areaTriangulo;

    }

    
}
