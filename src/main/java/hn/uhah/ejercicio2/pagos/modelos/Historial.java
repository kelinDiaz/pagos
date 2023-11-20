package hn.uhah.ejercicio2.pagos.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="historial")
public class Historial {

    @Id
    @Column(name = "idpago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpago; 

   @Column(name = "fechapago")
    private Date fechapago; 
    @Column(name = "horastrabajadas")
    private int horastrabajadas; 

    @Column(name = "precioporhora")
    private double precioporhora;


    @Column(name = "totalsueldo")
    private double totalsueldo; 


    
}
