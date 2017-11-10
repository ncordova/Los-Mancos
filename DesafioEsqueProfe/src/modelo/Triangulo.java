package modelo;

/**
 *
 * @author Alex971
 */
public class Triangulo extends Poligono implements Figura {

    public Triangulo(int vertices) {
        super(vertices);
    }

    Triangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void tipoTriangulo(){}//Verfiicar tipo de triangulo   isoceles,Escaleno o equilatero

    @Override
    public void calcularArea() {
        super.setArea(super.calculoAreaTriangulo(0, 1, 2));
    }

    @Override
    public void imprimirObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
