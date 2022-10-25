package com.segundaDemo.vehiculo.partes;
import lombok.Data;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

@Data
public class Auto {

    static final int DIAS_SEMANA = 7;
    static final int DIAS_LABORABLES = 5;
    private int kiloemtros;
    private String codigo;

    @OneToOne
    public Chofer esConducido;

    @OneToOne
    public Propietario propietario;

    @OneToOne
    public Motor tieneUn;

    @OneToMany
    private List<Ruedas> tiene = new ArrayList<Ruedas>();

    public int Autonomia(){
        return 5;
    }
}
