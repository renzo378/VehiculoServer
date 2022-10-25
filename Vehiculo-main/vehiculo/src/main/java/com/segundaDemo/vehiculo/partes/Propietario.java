package com.segundaDemo.vehiculo.partes;

import lombok.Data;

@Data
public class Propietario extends Persona{
    private String documento;
    static final String  Saludo = "Hola";
    
}
