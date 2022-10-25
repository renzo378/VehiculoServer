package com.segundaDemo.vehiculo.partes;

import lombok.Data;

@Data
public class  Chofer extends Persona {
    private int licencia;
    private String autorizacion;

    public String licenciaCompleta(String nombre , String apellido){
        return "afad";
    }
}
