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

    public double[] getLados() {
        return lados;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setLados(double[] lado) {//Copia lado por valor REVISAR
        this.lados = lado.clone();
    }

    public Point[] getPunto() {
        return punto;
    }

    public void setPunto(Point[] punto) {//Copia punto por valor REVISAR
        this.punto = punto.clone();
    }

    public void calcularPerimetro() {
        for (int i = 0; i < this.lados.length; i++) {
            this.perimetro += this.lados[i];
        }
    }

    public double calculoAreaTriangulo(int i1, int i2, int i3) {
        double areaTriangulo;
        double semiPerimetro = semiPerimetroTriangulo(i1, i2, i3);//designamos el semiperimetro S
        areaTriangulo = (semiPerimetro - this.lados[i1]) * (semiPerimetro - this.lados[i2]) * (semiPerimetro - this.lados[i3]);
        areaTriangulo = Math.sqrt(semiPerimetro * areaTriangulo);// Raiz cuadrada de lo anterior
        return areaTriangulo;
    }

}
