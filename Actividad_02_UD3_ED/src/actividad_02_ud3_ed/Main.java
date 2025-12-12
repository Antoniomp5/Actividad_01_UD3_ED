/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 * @author Anotnio "Para indicar los comentarios"
 */

public class Main {

    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    /**
     * 
     * @param args 
     */

    public static void main(String[] args) {
        
        CCuenta cuenta1;
        double saldoActual;
        int opcion = 0;
        // invocación del la clase CCuenta.java
        cuenta1 = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);
        do { // bucle do while para ejecutar los parametros ingrasados
            try { // try catch para la visualización de errores
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion = Integer.parseInt(dato.readLine());
                if (opcion == 1) { // if anidado, forma ineficiente para este código
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar = Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1, ingresar, opcion);
                } else if (opcion == 2) {
                    System.out.println("¿Cuánto desea retirar?: ");
                    float retirar = Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1, retirar, opcion);
                } else if (opcion == 3) {
                    System.out.println("Finalizamos la ejecución");
                } else {
                    System.err.println("Opción errónea");
                }
                /*                switch(opcion){ // forma eficiente del código
                    case 1:
                        System.out.println("¿Cuánto desea ingresar?: ");
                        float ingresar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,ingresar,opcion);
                        break;
                    case 2:
                        System.out.println("¿Cuátno desea retirar?: ");
                        float retirar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,retirar,opcion);
                        break;
                    case 3:
                        System.out.println("Finalizamos la ejecución");
                }
                 */   } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 3);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

      }
    /**
     * 
     * @param cuenta1
     * @param cantidad
     * @param opcion 
     */
    // metodo que invoca la clase CCuenta.java usando try/catch para visualizar los errores
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad, int opcion) {
        if (opcion == 2) {
            try {
                cuenta1.retirar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
        } else if (opcion == 1) {
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
