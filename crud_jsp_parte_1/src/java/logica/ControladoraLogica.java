
package logica;

import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearExperiencia(Experiencia exp)
    {
        controlPersistencia.crearExperiencia(exp);
    }
     public void bajaExperiencia(int id) throws NonexistentEntityException
    {
        controlPersistencia.bajaExperiencia(id);
    }
    
    
    
}
