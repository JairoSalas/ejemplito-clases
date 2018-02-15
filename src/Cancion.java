/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cancion 
{
    // atributos
    public String nombre;
    public Cancion (String titulo)
    {
        this.nombre = titulo;
    }
    
    public void sonar()
    {
        System.out.println("sonando " + this.nombre);
    }
}
