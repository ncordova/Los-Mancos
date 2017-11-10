package modelo;

public class Cuadrilatero extends Poligono implements Figura {

    public Cuadrilatero(int vertices) {
        super(vertices);
    }
    public void  tipoCuadrilatero(){}// Identifica tipo de cuadrilatero
    
    @Override
    public void calcularArea() {//Aquí hacer calculo de area de cuadrado
        super.setArea(super.calculoAreaTriangulo(0, 1, 2) + super.calculoAreaTriangulo(0, 2, 3));
    }

    @Override
    public void imprimirObjeto() {//Mostrar 1 objeto
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
