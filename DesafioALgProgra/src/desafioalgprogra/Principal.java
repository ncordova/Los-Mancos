package desafioalgprogra;

import desafioalgprogra.figuras.Calculadora;
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
        int total;
        int opcion = 0;
        float traslacionX = 0;
        float traslacionY = 0;
        String puntoAux;
        while (true) {
            System.out.println("Ingrese numero de la figura que desea generar : \n    1.- Triángulo \n    2.- Cuadrilátero ");
            System.out.print("    Respuesta :  ");
            try {
                opcion = Integer.parseInt(leer.nextLine());
            } catch (Exception e) {
                System.out.println("ERROR : Respuesta no válida...");
            }
            if (opcion == 1) { //llamar a los triangulos asfjkas
                Triangulos t = new Triangulos();
                String punto1 = null;
                String punto2 = null;
                String punto3 = null;
                float dato1X = -999;
                float dato2X = -999;
                float dato3X = -999;
                float dato1Y = -999;
                float dato2Y = -999;
                float dato3Y = -999;
                do {
                    try {
                        System.out.print("Ingrese el punto 1: ");

                        punto1 = leer.nextLine();
                        dato1X = t.datosx(punto1);
                        dato1Y = t.datosy(punto1);
                    } catch (Exception e) {
                        dato1X = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }

                } while (dato1X == -999);
                do {
                    try {
                        System.out.print("Ingrese el punto 2: ");

                        punto2 = leer.nextLine();
                        dato2X = t.datosx(punto2);
                        dato2Y = t.datosy(punto2);
                    } catch (Exception e) {
                        dato2X = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (dato2X == -999);
                do {
                    try {
                        System.out.print("Ingrese el punto 3: ");

                        punto3 = leer.nextLine();
                        dato3X = t.datosx(punto3);
                        dato3Y = t.datosy(punto3);
                    } catch (Exception e) {
                        dato3X = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (dato3X == -999);
                Calculadora ct = new Calculadora();
                float lado1 = ct.calcularLado(dato1X, dato1Y, dato2X, dato2Y);
                float lado2 = ct.calcularLado(dato2X, dato2Y, dato3X, dato3Y);
                float lado3 = ct.calcularLado(dato3X, dato3Y, dato1X, dato1Y);
                float perimetro = ct.calcularPerimetroTriangulo(lado1, lado2, lado3);
                double angulo1 = ct.calcularAngulo(punto1, punto2, punto3);
                double angulo2 = ct.calcularAngulo(punto2, punto3, punto1);
                double angulo3 = ct.calcularAngulo(punto3, punto1, punto2);
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
                System.out.println("El angulo 1 es de : " + angulo1 + "°");
                System.out.println("El angulo 2 es de : " + angulo2 + "°");
                System.out.println("El angulo 3 es de : " + angulo3 + "°");
                System.out.println("Lado 1 : " + lado1 + " unidades");
                System.out.println("Lado 2 : " + lado2 + " unidades");
                System.out.println("Lado 3 : " + lado3 + " unidades");
                System.out.println("el perimetro es : " + perimetro + " unidades");
                float area = ct.calcularAreaTriangulo(lado1, lado2, lado3);
                System.out.println("el area es  : " + area + " unidades cudradas");
                do {
                    try {
                        System.out.print("Ingrese el vector Traslacion : ");
                        puntoAux = leer.nextLine();
                        traslacionX = t.datosx(puntoAux);
                        traslacionY = t.datosy(puntoAux);
                    } catch (Exception e) {
                        traslacionX = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (traslacionX == -999);
                System.out.println("El púnto 1 es : (" + (dato1X + traslacionX) + "," + (dato1Y + traslacionY) + ")");
                System.out.println("El púnto 2 es : (" + (dato2X + traslacionX) + "," + (dato2Y + traslacionY) + ")");
                System.out.println("El púnto 3 es : (" + (dato3X + traslacionX) + "," + (dato3Y + traslacionY) + ")");

            }

            if (opcion == 2) {//llamar a los cuadraditoos
                Triangulos t = new Triangulos();
                String puntoA = null;
                String puntoB = null;
                String puntoC = null;
                String puntoD = null;
                float datoX1 = -999;
                float datoX2 = -999;
                float datoX3 = -999;
                float datoX4 = -999;
                float datoY1 = -999;
                float datoY2 = -999;
                float datoY3 = -999;
                float datoY4 = -999;
                do {
                    try {
                        System.out.print("Ingrese el punto A: ");
                        puntoA = leer.nextLine();
                        datoX1 = t.datosx(puntoA);
                        datoY1 = t.datosy(puntoA);
                    } catch (Exception e) {
                        datoX1 = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (datoX1 == -999);
                do {
                    try {
                        System.out.print("Ingrese el punto B: ");
                        puntoB = leer.nextLine();
                        datoX2 = t.datosx(puntoB);
                        datoY2 = t.datosy(puntoB);
                    } catch (Exception e) {
                        datoX2 = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (datoX2 == -999);
                do {
                    try {
                        System.out.print("Ingrese el punto C: ");
                        puntoC = leer.nextLine();
                        datoX3 = t.datosx(puntoC);
                        datoY3 = t.datosy(puntoC);
                    } catch (Exception e) {
                        datoX3 = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (datoX3 == -999);
                do {
                    try {
                        System.out.print("Ingrese el punto D: ");
                        puntoD = leer.nextLine();
                        datoX4 = t.datosx(puntoD);
                        datoY4 = t.datosy(puntoD);
                    } catch (Exception e) {
                        datoX4 = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (datoX4 == -999);
                Calculadora cc = new Calculadora();
                float ladoA = cc.calcularLado(datoX1, datoY1, datoX2, datoY2);
                float ladoB = cc.calcularLado(datoX2, datoY2, datoX3, datoY3);
                float ladoC = cc.calcularLado(datoX3, datoY3, datoX4, datoY4);
                float ladoD = cc.calcularLado(datoX4, datoY4, datoX1, datoY1);
                float ladoX = cc.calcularLado(datoX1, datoY1, datoX3, datoY3);
                float perimetroC = ladoA + ladoB + ladoC + ladoD;
                double anguloA = cc.calcularAngulo(puntoA, puntoB, puntoD);
                double anguloB = cc.calcularAngulo(puntoB, puntoC, puntoA);
                double anguloC = cc.calcularAngulo(puntoC, puntoD, puntoB);
                double anguloD = cc.calcularAngulo(puntoD, puntoA, puntoC);
                if (ladoA == ladoB && ladoA == ladoD && anguloA == 90 && anguloB == 90) {//si es cuadrado
                    this.cuadrado++;
                    System.out.println("El cuadrilatero ingresado es un CUADRADO perteneciente a los PARALELOGRAMOS");
                } else if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoD && anguloA != anguloB) {//si es rombo
                    this.rombo++;
                    System.out.println("El cuadrilatero ingresado es un ROMBO perteneciente a los PARALELOGRAMOS");
                } else if (ladoA != ladoB && ladoA == ladoC && ladoB == ladoD && anguloA != anguloB) {//si es romboide
                    this.romboide++;
                    System.out.println("El cuadrilatero ingresado es un ROMBOIDE perteneciente a los PARALELOGRAMOS");
                } else if (ladoA != ladoB && ladoA == ladoC && ladoB == ladoD && anguloA == anguloB) {//si es rectangulo
                    this.rectangulo++;
                    System.out.println("El cuadrilatero ingresado es un RECTANGULO perteneciente a los PARALELOGRAMOS");
                } else if (ladoA == ladoC || ladoB == ladoD) {//si es trapecio
                    this.trapecio++;
                    System.out.println("El cuadrilatero ingresado es un TRAPECIO perteneciente a los NO PARALELOGRAMOS");
                } else {//de lo contrario solo puede ser trapezpoide
                    this.trapezoide++;
                    System.out.println("El cuadrilatero ingresado es un TRAPEZOIDE perteneciente a los NO PARALELOGRAMOS");
                }
                System.out.println("El angulo 1 es de : " + anguloA + "°");
                System.out.println("El angulo 1 es de : " + anguloB + "°");
                System.out.println("El angulo 1 es de : " + anguloC + "°");
                System.out.println("El angulo 1 es de : " + anguloD + "°");
                System.out.println("Lado 1 : " + ladoA + " unidades");
                System.out.println("Lado 2 : " + ladoB + " unidades");
                System.out.println("Lado 3 : " + ladoC + " unidades");
                System.out.println("Lado 4 : " + ladoD + " unidades");
                System.out.println("el perimetro es : " + perimetroC+ " unidades");
                System.out.println("el area es  : " + cc.calcularAreaCuadrilatero(ladoA, ladoB, ladoC, ladoD, ladoX) + " unidades cudradas");
                do {
                    try {
                        System.out.print("Ingrese el vector Traslacion : ");
                        puntoAux = leer.nextLine();
                        traslacionX = t.datosx(puntoAux);
                        traslacionY = t.datosy(puntoAux);
                    } catch (Exception e) {
                        traslacionX = -999;
                        System.out.println("ERROR : Respuesta no válida...");
                    }
                } while (traslacionX == -999);
                System.out.println("El púnto 1 es : (" + (datoX1 + traslacionX) + "," + (datoY1 + traslacionY) + ")");
                System.out.println("El púnto 2 es : (" + (datoX2 + traslacionX) + "," + (datoY2 + traslacionY) + ")");
                System.out.println("El púnto 3 es : (" + (datoX3 + traslacionX) + "," + (datoY3 + traslacionY) + ")");
                System.out.println("El púnto 4 es : (" + (datoX4 + traslacionX) + "," + (datoY4 + traslacionY) + ")");

            }
            do {
                try {
                    System.out.println("¿Desea salir del Programa? :");
                    System.out.println("    1.- Si");
                    System.out.println("    2.- No");
                    System.out.print("    Respuesta : ");
                    opcion = Integer.parseInt(leer.nextLine());
                } catch (Exception e) {
                    System.out.println("ERROR : Respuesta no válida...");
                }
            } while (opcion != 1 && opcion != 2);
            if (opcion == 1) {
                total = equilatero + isosceles + escaleno + cuadrado + rombo + romboide + rectangulo + trapecio + trapezoide;
                System.out.println("Se han ingresado un total de " + total + " figuras, de las cuales : ");
                System.out.println("-" + equilatero + " Son triangulos equilateros");
                System.out.println("-" + escaleno + " Son triangulos escalenos");
                System.out.println("-" + isosceles + " Son triangulos isosceles");
                System.out.println("-" + cuadrado + " Son Cuadrados");
                System.out.println("-" + rombo + " Son Rombos");
                System.out.println("-" + romboide + " Son Romboides");
                System.out.println("-" + rectangulo + " Son Rectangulos");
                System.out.println("-" + trapecio + " Son Trapecios");
                System.out.println("-" + trapezoide + " Son Trapezoides");

                break;
            }

        }
    }

}
