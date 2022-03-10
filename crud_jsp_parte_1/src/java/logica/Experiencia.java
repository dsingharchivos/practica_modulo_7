
package logica;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="experiencia")
public class Experiencia implements Serializable {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="empresa",length=100,nullable=false)
    private String empresa;
    
    @Column(name="puesto",length=100,nullable=false)
    private String puesto;
    
    @Column(name="anio_ingreso",length=4,nullable=false)
    private String anio_ingreso;
    
    @Column(name="anio_egreso",length=25,nullable=false)
    private String anio_egreso;

    public Experiencia() {
    }

    public Experiencia(int id, String empresa, String puesto, String anio_ingreso, String anio_egreso) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(String anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public String getAnio_egreso() {
        return anio_egreso;
    }

    public void setAnio_egreso(String anio_egreso) {
        this.anio_egreso = anio_egreso;
    }
    
    
    
    
    
}
