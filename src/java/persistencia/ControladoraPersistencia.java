
package persistencia;

import logica.Experiencia;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    ExperienciaJpaController expJPA = new ExperienciaJpaController();
    
    public void crearExperiencia(Experiencia exp)
    {
        expJPA.create(exp);
    }
    
    public void bajaExperiencia(int id) throws NonexistentEntityException
    {
        expJPA.destroy(id);
    }
    
}
