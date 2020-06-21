/*El precio de
alquiler que se debe pagar por un departamento se compone del precio base de
alquiler, más las expensas, más $500 si es para uso comercial*/
package inmobiliaria;

public class Departamento extends Propiedad{
    private double precioExpensas;
    
    public Departamento(double precioExpensas, String direccion, int cantHabitaciones, double precioBase, 
            boolean isUsoComercial, int cantInquilinos){
        
        super(direccion,cantHabitaciones,precioBase,isUsoComercial,cantInquilinos);
        this.precioExpensas=precioExpensas;
    }
    
    @Override
    public double precioAlquiler(){
        double precio;
        precio=this.precioBase+precioExpensas;
        if(this.isUsoComercial){
            precio+=500;
        }
        return precio;
    }
}
