package hn.uhah.ejercicio2.pagos.modelos;

import java.sql.Date;
import java.util.List; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")

public class Empleados {

    @Id
    @Column(name= "dni")
    private String dni; 
     
    @Column(name = "nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido; 

    @Column(name="fechaingreso ")
    private Date fechaingreso; 
    
@OneToMany(mappedBy = "empleados")
 private List<Pagos>pagos; 

}
