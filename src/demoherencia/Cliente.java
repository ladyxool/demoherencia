/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Lenovo
 */
public class Cliente {
    
 private String nombre;
 private String apellido;
 private String fechadenacimiento;
 private String direccion;
 private String ocupacion;
 private String telefono;
 private String email;
 public Cliente (String nombre, String apellido ){
     this.nombre = nombre;   
 }
 public void setnombre (String nombre){
     this.nombre = nombre;
 } 
 public String getnombre (){
     return nombre;
 }
 public void setapellidos(String apellido){
     this.apellido = apellido;
 }
 public String getapellido(){
     return apellido;    
 }
 public void setfechadenacimiento(String fechadenacimiento){
     this.fechadenacimiento = fechadenacimiento;    
 }
   public String getfechadenacimiento(){
       return fechadenacimiento;
   }      
   public void  setdireccion(String direccion){
       this.direccion = direccion;  
   }
   public String fetdireccion(){
       return direccion;
   }
     public void setocupacion(String ocupacion){
         this.ocupacion = ocupacion;   
     } 
  
     public String getocupacion(){
         return ocupacion;
     }
     public void settelefono(String telefono){
         
     }
public void setemail(String email){
         this.email = email;
     }
     public String getemail(){
         return email;
     }
     
     
    
  
  
  
    
    

            
}
