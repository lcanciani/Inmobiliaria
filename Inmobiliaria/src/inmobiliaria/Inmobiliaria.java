
package inmobiliaria;

import java.util.ArrayList;

/*1. Una inmobiliaria nos solicita un programa con ventanas para llevar el
registro de las propiedades que alquila.
De las propiedades se necesita almacenarlos datos de la dirección, cantidad
de habitaciones, precio base de alquiler, si será para uso comercial y la cantidad de
inquilinos parael caso en que la propiedad no sea para uso comercial.
Se registran dos tipos de propiedades: casas y departamentos. De las casas
adicionalmente se desea registrar si posee garaje, y de los departamentos se desea
registrar además el precio de las expensas.
El precio de alquiler que se debe pagar por una casa se compone del precio
base de alquiler, más $1000 en el caso que sea para uso comercial. El precio de
alquiler que se debe pagar por un departamento se compone del precio base de
alquiler, más las expensas, más $500 si es para uso comercial.
El programa debe permitir:
Cargar los datos de las propiedades.
Calcular y mostrar el monto promedio de alquileres de las propiedades en
donde vivan 2 inquilinos.
Calcular y mostrar la cantidad de casas de 3 habitaciones o más que posean
garaje*/

public class Inmobiliaria {

    private ArrayList <Propiedad> propiedades;
    
    public Inmobiliaria(){
        propiedades=new ArrayList<>();
    }
    
    public void AgregarPropiedad(Propiedad p){
        propiedades.add(p);
    }
    
    
    
    public double dosInquilinos(){
        double montoPromedio = 0;
        int cantProp = 0;
        double montoTotal = 0;
        for (Propiedad p : propiedades) {
            if(p.getCantInquilinos() == 2){
                cantProp++;
                montoTotal += p.precioAlquiler();
            }             
        }
        if(cantProp > 0)
            montoPromedio = montoTotal/cantProp;
        
    return montoPromedio;
}
    public int masTresHabitacionesGaraje(){
        int cant = 0;
        for (Propiedad p : propiedades) {
            if(p instanceof Casa && p.getCantHabitaciones()>2){
                Casa c = (Casa)p;
                if(c.getIsGarage())
                    cant++;
            }
        }
        return cant;
    }
    
    public String[] stringProp(){
        String[] prop1 = new String[propiedades.size()];
        for (int i = 0; i < propiedades.size(); i++) {
            prop1[i]=propiedades.get(i).toString();
        }
        return prop1;
    }
}
