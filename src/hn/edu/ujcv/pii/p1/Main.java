package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        int Numero1, Numero2;
        double suma;

        System.out.println("Ingrese un numero");
        Numero1 = teclado.nextInt();
        System.out.println("Ingrese Un segundo numero");
        Numero2 = teclado.nextInt();

        suma = Numero1 + Numero2;

        System.out.println("La suma de los numeros es: "+suma);

    }
}
