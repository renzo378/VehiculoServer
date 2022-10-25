package com.segundaDemo.vehiculo.partes;

import lombok.Data;

@Data
@Entity
public class Propietario extends Persona{
    private String documento;
    static final String  Saludo = "Hola";
    
}
