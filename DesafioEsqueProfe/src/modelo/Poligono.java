package modelo;

import java.awt.Point;

/**
 *
 * @author Alex971
 */
public abstract class Poligono implements Figura {

    private double[] lados;
    private Point[] punto;
    private double perimetro;
    private double area;

    public double semiPerimetroTriangulo(int i1, int i2, int i3) {//hace calculo de semiperimetro de un triangulo
        double semiPerimetro = 0;
        semiPerimetro += this.lados[i1];
        semiPerimetro += this.lados[i2];
        semiPerimetro += this.lados[i3];
        return (semiPerimetro / 2);
    }

    public Poligono() {
    }//B.P para inicializar

    public Poligono(int puntos) {//Inicializa con valor
        this.lados = new double[puntos];
        this.punto = new Point[puntos];
    }
    
    public double calcularMagnitud(Point punto1,Point punto2){
        double lado = Math.pow((punto2.x-punto1.x),2)+Math.pow((punto2.y-punto1.y),2);
        return Math.sqrt(lado);
    }

    public void setLados(Point[] punto) {//Guarda en un arreglo el tamanio de cada lado
        int i = 1;
        for (; i < punto.length; i++) {
            this.lados[i-1]=calcularMagnitud(punto[i-1], punto[i]);
        }
        this.lados[i]=calcularMagnitud(punto[i], punto[0]);
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double[] getLados() {//Copia lado por valor REVISAR
        return this.lados;
    }

    public Point[] getPunto() {
        return punto;
    }

    public void setPunto(Point punto, int i) {//Copia punto por valor REVISAR
        this.punto[i]=punto;
    }

    public void setPerimetro() {//Designa el perimetro de la figura sumando todos los lados
        for (int i = 0; i < this.lados.length; i++) {
            this.perimetro += this.lados[i];
        }
    }

    public double calculoAreaTriangulo(int i1, int i2, int i3) {//Calcula area del sector segun la fórmula de heron
        double areaTriangulo;
        double semiPerimetro = semiPerimetroTriangulo(i1, i2, i3);//designamos el semiperimetro S
        areaTriangulo = (semiPerimetro - this.lados[i1]) * (semiPerimetro - this.lados[i2]) * (semiPerimetro - this.lados[i3]);
        areaTriangulo = Math.sqrt(semiPerimetro * areaTriangulo);// Raiz cuadrada de lo anterior
        return areaTriangulo;
    }

}
