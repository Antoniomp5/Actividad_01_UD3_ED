 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Antonio "generación de javadoc"
 */
public class CCuenta {

/**
 * @hiden declaración de los atributos de la clase
 */
     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de la cuenta
    * @param sal La cantidad de ninero que hay en la cuenta
    * @param tipo L la comisión de interés que está en la cuenta
    *  Estos cuatro son las condciones de la clase
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Se utiliza para asignar los metodos
   * donde se menciona
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    public String obtenerNombre()
    {
        return nombre;
    }

    
     public double estado ()
    {
        return saldo;
    }
/**
 * Mas metodos de la clase
 * @param cantidad variable para introducir x número
 * @throws Exception útilizado para evitar errores como la initroducción de negativos
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }


    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return para que los metodos puedan devolver los parametros
     * introducidos en la clase principal
     */
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }
    /**
     * 
     * @param cuenta metodo 2
     * 
     */

  
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
/**
 * 
 * @param saldo metodo 3
 */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 
  public double getTipoInterés() {
    return tipoInterés;
  }
/**
 * 
 * @param tipoInterés metodo 4
 * al igual que sus hermanos se una para mencionarlo y asignarle unas variables
 */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
