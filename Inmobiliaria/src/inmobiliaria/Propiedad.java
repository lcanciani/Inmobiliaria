/*De las propiedades se necesita almacenarlos datos de la dirección, cantidad
de habitaciones, precio base de alquiler, si será para uso comercial y la cantidad de
inquilinos parael caso en que la propiedad no sea para uso comercial.*/
package inmobiliaria;

public abstract class Propiedad {
    private String direccion;
    private int cantHabitaciones;
    protected double precioBase;
    protected boolean isUsoComercial;
    private int cantInquilinos;
    
    public int getCantInquilinos(){
        return cantInquilinos;
    }
    
    public Propiedad (String direccion, int cantHabitaciones, double precioBase, 
            boolean isUsoComercial, int cantInquilinos){
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.precioBase = precioBase;
        this.isUsoComercial = isUsoComercial;
        this.cantInquilinos = cantInquilinos;
    }
     public abstract double precioAlquiler();       
}
