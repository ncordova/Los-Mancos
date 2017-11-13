package desafioalgprogra;

import desafioalgprogra.figuras.CalculosTriangulo;
import desafioalgprogra.figuras.Triangulos;
import java.util.Scanner;

/**
 *
 * @author Ratita
 */
public class Principal {

    int equilatero = 0;
    int isosceles = 0;
    int escaleno = 0;
    int cuadrado = 0;
    int rectangulo = 0;
    int rombo = 0;
    int romboide = 0;
    int trapecio = 0;
    int trapezoide = 0;
    Scanner leer = new Scanner(System.in);

    public void menu1() {
        System.out.println("Puntos a ingresar \n 1.- 3 puntos \n 2.- 4 puntos ");

        int opcion1 = leer.nextInt();
        if (opcion1 == 1) { //llamar a los triangulos asfjkas
            Triangulos t = new Triangulos();
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese el punto : ");
            String punto1 = leer.nextLine();
            int dato1X = t.datosx(punto1);
            int dato1Y = t.datosy(punto1);
            System.out.print("Ingrese el punto : ");
            String punto2 = leer.nextLine();
            int dato2X = t.datosx(punto2);
            int dato2Y = t.datosy(punto2);
            System.out.print("Ingrese el punto : ");
            String punto3 = leer.nextLine();
            int dato3X = t.datosx(punto3);
            int dato3Y = t.datosy(punto3);
            CalculosTriangulo ct = new CalculosTriangulo();
            float lado1 = ct.calcularLado(dato1X, dato1Y, dato2X, dato2Y);
            float lado2 = ct.calcularLado(dato2X, dato2Y, dato3X, dato3Y);
            float lado3 = ct.calcularLado(dato3X, dato3Y, dato1X, dato1Y);
            float perimetro = ct.calcularperimetro(lado1, lado2, lado3);
            if (lado1 == lado2 && lado1 == lado3) {
                equilatero++;
                System.out.println("El triangulo ingresado es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                isosceles++;
                System.out.println("El triangulo ingresado es isosceles");
            } else {
                escaleno++;
                System.out.println("El triangulo ingresado es escaleno");
            }
            System.out.println(lado1);
            System.out.println(lado2);
            System.out.println(lado3);
            System.out.println("el perimetro es : " + perimetro);
            float area = ct.calcularArea(lado1, lado2, lado3);
            System.out.println("el area es  : " + area);

        }

        if (opcion1 == 2) {
            //llamar a los cuadraditoos
        }

    }

}
