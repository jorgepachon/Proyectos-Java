package Ejercicio1;

public class Casa {
    private double Superficie;
    private String Direccion;
    private Salon Salon;
    private Cocina Cocina;

    public Casa(double superficia, String direccion) {
        this.Superficie = Superficie;
        this.Direccion = direccion;
        Salon = new Salon();
        Cocina = new Cocina();
    }
//
    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double Superficie) {
    	this.Superficie = Superficie;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public void getSalon() {
        System.out.println("Numero de Televisores: "+Salon.getNumeroDeTelevisores());
        System.out.println("Tipo Salon: "+Salon.getTipoSalon());
    }

    public void setSalon(Salon salon) {
        Salon = salon;
    }

    public void getCocina() {
        System.out.println("Indispensable: "+Cocina.getEsIndependiente());
        System.out.println("Numero de fuegos: "+Cocina.getNumeroDeFuegos());
    }

    public void setCocina(Cocina cocina) {
        Cocina = cocina;
    }
    public String toString(){
    	return "Casa [superficie: "+ getSuperficie() + "| Dierrcion: "+ getDireccion()+" ]";
    }
}