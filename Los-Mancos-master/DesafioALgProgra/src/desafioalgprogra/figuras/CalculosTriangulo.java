
package desafioalgprogra.figuras;

/**
 *
 * @author Ratita
 */
public class CalculosTriangulo {
     public float calcularLado(float x1, float y1, float x2, float y2) {
        float lado = (float) Math.abs(Math.sqrt ( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)  ));
        return lado;
     }

    public float calcularperimetro(float lado_a, float lado_b, float lado_c) {
        float perimetro = (lado_a + lado_b + lado_c);
        return perimetro;
    }

    public float calcularArea(float lado_a, float lado_b, float lado_c) {
        float semiperimetro = (lado_a + lado_b + lado_c)/2; 
        float areaTriangulo = (float) Math.sqrt(semiperimetro * (semiperimetro - lado_a) * (semiperimetro - lado_b) * (semiperimetro - lado_c)); // sacamos el area utilizando la formula de heron
        return areaTriangulo;

    }

    
}
