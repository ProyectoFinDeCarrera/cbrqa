/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Coleccion.almacenamiento;

import java.util.List;
import modelo.Coleccion;
import modelo.Pregunta;
import modelo.Respuesta;

/**
 *
 * @author Bea
 */
public interface GestorAlmacenamiento {

    public void inicializar(Coleccion coleccion);
    public void almacenar(Pregunta pregunta);
    public Pregunta recuperarPregunta(long id);
    public List <Pregunta> recuperarConsulta(Consulta consulta);
    public Respuesta recuperarRespuesta(long id);


}
