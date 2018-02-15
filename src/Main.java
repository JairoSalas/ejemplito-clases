/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main (String[] args)
    {
        Cancion x = new Cancion ("x");
       // x.nombre = "rockcito";
        x.sonar();
        
        Cuenta Y = new Cuenta ();
        Y.numero = 1234;
        Y.clave = "xD";
        Y.dueño = "lol";
        Y.saldo = 10000;
        
        Y.consignar(1000);
        Y.retirar(102);
        Y.cambiarClave("DX");
        Y.consultarSaldo();
    }
    
    
}
