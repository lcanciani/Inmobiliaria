/*El precio de alquiler que se debe pagar por una casa se compone del precio
base de alquiler, más $1000 en el caso que sea para uso comercial.*/
package inmobiliaria;

public class Casa extends Propiedad{
    private boolean garaje;
    
    public Casa(boolean garaje,String direccion, int cantHabitaciones, double precioBase, 
            boolean isUsoComercial, int cantInquilinos){
        
        super(direccion,cantHabitaciones,precioBase,isUsoComercial,cantInquilinos);
        this.garaje=garaje;
    }
    
    @Override
    public double precioAlquiler(){
        double precio = 0;
        if(this.isUsoComercial)
            precio=this.precioBase+1000;
        else 
            precio = this.precioBase;
        return precio;
    }
    
}
