/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import java.util.Scanner;
import modelo.Asignatura;
import modelo.Carrera;
import servicios.CarreraServicio;

/**
 *
 * @author Adrian
 */
public class CarreraController{
    public CarreraServicio carreraServicio;  
   
    
    public CarreraController()
    {
        carreraServicio = new CarreraServicio();
          
    }
    public Carrera crear(int codigo, String nombre, int nAsignaturas, int yearsDuracion, int codigoA, String nombreA, String ProfesorA, int aulaA, String edificioA)
    {           
        Asignatura asignatura = new Asignatura(codigoA, nombreA, ProfesorA, aulaA, edificioA);        
        Carrera carrera =  new Carrera(codigo, nombre, nAsignaturas, asignatura, yearsDuracion);
        carreraServicio.crear(carrera);
        return carrera;
    }

  private String nombreMayu(String nombre)
  {
      return nombre.toUpperCase();
  }
  private boolean isYearValid(int year)
  {
      if (year > 0 && year < 7)
      {
          return true;
      }
      else
      {
          return false;
      }
  }
    public void modificar(int codigo, String nombre, int nAsignaturas, int yearsDuracion, int codigoA, String nombreA, String ProfesorA, int aulaA, String edificioA, int codigoEdit)
    {
        Asignatura asignatura = new Asignatura(codigoA, nombreA, ProfesorA, aulaA, edificioA);        
        Carrera carrera =  new Carrera(codigo, nombre, nAsignaturas, asignatura, yearsDuracion);
        carreraServicio.modificar(codigo, carrera);
    }
    
    public List<Carrera> listar()
    {
       return carreraServicio.Listar();
    }
    
    public void eliminar(int codigo)
    {
        carreraServicio.eliminar(codigo);
    }
}
