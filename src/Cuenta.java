/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    public int numero;
    public String clave;
    public String dueño;
    public int saldo;
    
    public int consignar(int numero)
    {
        return this.numero = this.numero + numero; 
    } 
     public int retirar(int numero)
    {
        return this.numero = this.numero - numero; 
    } 
      public void cambiarClave(String clave)
    {
        this.clave = clave;
        System.out.println(this.clave);
    } 
       public void consultarSaldo()
    {
        System.out.println(this.saldo);
    } 
}
