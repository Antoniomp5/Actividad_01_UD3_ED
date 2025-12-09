/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author antonio "para las modificaciones y comentarios"
 */
public class Actividad_01_UD3_ED 
{
    // Atributos privados del proyecto
    private static byte[] bufer = new byte[1000]; // Refactorizado de buffer a búfer
    private static String nombreArchivo = "fichero.dat"; // Refactorizado de fileName a nombreArchivo, este artibuto vale
    // para cada timpo de fichero de tecto plano
    private static FileInputStream entradaStream = null; // Refactorizado de inputStream a entradaStream
    private static BufferedInputStream entradaBufer = null; // Refactorizado de inputBuffer a entradaBúfer
    
    // Metodos de la función
    public static void inicializateFiles() throws FileNotFoundException
    {
        entradaStream = new FileInputStream(nombreArchivo);
        entradaBufer = new BufferedInputStream(entradaStream);
    }
    
    public static int showFileText() throws IOException
    {
        int total = 0; // Declaración/inicialización de las variables
        int nRead = 0;
        // Bucle while para leer el "fichero.dat" u otra extensión
        while((nRead = entradaStream.read(bufer)) != -1) 
        {
            System.out.println(new String(bufer));
            total += nRead;
        }
        
        return total;
    }
    
    /**
     * @param args para los comando en linea de argumentos
     */
    public static void main(String[] args) 
    {        
        // main del programa, este permite poder leer los ficheros de texto plano usando un try/catch/finally 
        // para visualizar errores
        try 
        {
            inicializateFiles();
            
            int total = showFileText();           

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( entradaBufer != null && entradaStream != null )
                {
                    entradaStream.close();
                    entradaBufer.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }
    
}
