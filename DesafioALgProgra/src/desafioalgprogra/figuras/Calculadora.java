package desafioalgprogra.figuras;

/**
 *
 * @author Ratita
 */
public class Calculadora {

    public float calcularLado(float x1, float y1, float x2, float y2) {
        float lado = (float) Math.abs(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return lado;
    }

    public float calcularPerimetroTriangulo(float lado_a, float lado_b, float lado_c) {
        float perimetro = (lado_a + lado_b + lado_c);
        return perimetro;
    }

    public float calcularAreaTriangulo(float lado_a, float lado_b, float lado_c) {
        float semiperimetro = (lado_a + lado_b + lado_c) / 2;
        float areaTriangulo = (float) Math.sqrt(semiperimetro * (semiperimetro - lado_a) * (semiperimetro - lado_b) * (semiperimetro - lado_c)); // sacamos el area utilizando la formula de heron
        return areaTriangulo;

    }

    public double calcularAngulo(String puntoActual, String puntoSiguiente, String puntoAnterior) {
        Triangulos t = new Triangulos();
        Calculadora c = new Calculadora();
        int x1 = t.datosx(puntoActual);
        int y1 = t.datosy(puntoActual);
        int x2 = t.datosx(puntoSiguiente);
        int y2 = t.datosy(puntoSiguiente);
        int x3 = t.datosx(puntoAnterior);
        int y3 = t.datosy(puntoAnterior);
        double productoEscalar = ((x3 - x1) * (x2 - x1)) + ((y3 - y1) * (y2 - y1));
        double productoModulo = (c.calcularLado(x1, y1, x3, y3) * c.calcularLado(x1, y1, x2, y2));
        double angulo = Math.acos(productoEscalar / productoModulo);//Puse int para que quede cerrado en un angulo.
        angulo=Math.toDegrees(angulo);
        return angulo;
    }

    public double calcularAreaCuadrilatero(float lado_a, float lado_b, float lado_c, float lado_d, float lado_x) {
        double area = (calcularAreaTriangulo(lado_a, lado_b, lado_x) + calcularAreaTriangulo(lado_x, lado_c, lado_d));
        return area;
    }
}
