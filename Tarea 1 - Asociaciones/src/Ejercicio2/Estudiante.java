package Ejercicio2;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class Estudiante {

	private String nombre;
	private String apellidos;
	private String fecha_Nac;
	
	 private  List<Asignatura> assignaturas = new ArrayList<Asignatura>();

	 public Estudiante(String non, String fechaNac) {
	        this.nombre = non;
	        this.fecha_Nac = fechaNac;
	    }
	    
	//METODOS GETTERS & SETTERS
	    
	    public void setNon(String non) {
	        this.nombre = non;
	    }

	    public void setEdad(String fecha_Nac) {
	        this.fecha_Nac = fechaNac;
	    }

	    public String getNon() {
	        return nombre;
	    }

	    public String getEdad() {
	        return fecha_Nac;
	    }
	    
	    public void addAsignatura (Asignatura asignatura) {   
	        
	        boolean validacion = true;
	        /*
	        for (int i = 0; i < numAsignaturas; i++) {
	            if (assignaturas.get(i).equals(asignatura.getNom())) {
	                validacion = false;
	                break;
	                
	                //Si encontramos una asignatura con el mismo nombre, 
	                //Validacion tendra el valor de "False"
	                //Y el For terminara.
	            }
	        }
	        */
	        
	        boolean repetit = false;
	        
	             for (Asignatura a: this.assignaturas) {
	                 repetit = a.getNom().equalsIgnoreCase(asignatura.getNom());
	             }
	        
	        //Despues, segun el valor de Validacion, decido si insertar la asignatura
	        //O nviar un mensaje de error al usuario.
	        if (validacion != true){
	            System.out.println("Error repeticion de asignatura");
	        } else {
	            
	            this.assignaturas.set(this.numAsignaturas, asignatura);
	            this.numAsignaturas ++;
	        }
	        
	    }
	    
	    public double calculMitja () {
	        double mediaTotal = 0;
	        Integer i = 0;
	        
	        for (i = 0; i < numAsignaturas; i++) {
	            mediaTotal = mediaTotal + assignaturas.get(i).getNota();
	        }
	        
	        return mediaTotal = mediaTotal / i;
	    }

	    @Override
	    public String toString() {
	        
	        Integer i = 0;  
	        String InfoAsignaturas = "";
	        
	        for (i = 0; i < numAsignaturas; i++) {
	            InfoAsignaturas += "\nAsignatura "+ i +"(" +assignaturas.get(i).getNom() + ") Nota : " + assignaturas.get(i).getNota() + " || "+ assignaturas.get(i).getAprovat(assignaturas.get(i).getNota());
	        }
	        return "\nEstudiante{" + "non=" + non + ", edad=" + edad + "} " + InfoAsignaturas + "\nCon una media total de: " + this.calculMitja();
	    }

	 
	    
	}