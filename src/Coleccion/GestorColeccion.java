/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Coleccion;

import Coleccion.almacenamiento.GestorAlmacenamiento;
import Coleccion.analizadores.Analizador;
import Coleccion.analizadores.TipoAnalisis;
import Coleccion.cargadores.Cargador;
import java.net.URI;
import java.util.List;
import modelo.Coleccion;
import modelo.Consulta;
import modelo.Pregunta;
import modelo.RepresentacionAnalizada;

/**
 *
 * @author Bea
 */
public class GestorColeccion {

   private Cargador cargador;
   private Analizador analizador;
   private GestorAlmacenamiento gestorAlmacenamiento;
   private Coleccion coleccion;

    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public Analizador getAnalizador() {
        return analizador;
    }

    public void setAnalizador(Analizador analizador) {
        this.analizador = analizador;
    }

    public Cargador getCargador() {
        return cargador;
    }

    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    public GestorAlmacenamiento getGestorAlmacenamiento() {
        return gestorAlmacenamiento;
    }

    public void setGestorAlmacenamiento(GestorAlmacenamiento gestorAlmacenamiento) {
        this.gestorAlmacenamiento = gestorAlmacenamiento;
    }
   
   

    public void inicializar(Coleccion coleccion){
        //inicializar Cargadores y Analizadores
        cargador.inicializar();
        analizador.inicializar();
        gestorAlmacenamiento.inicializar(coleccion);

    }

    public void añadirRecurso(URI recurso){
        
        List <Pregunta> preguntas= cargador.cargarRecurso(recurso);
        
        for(Pregunta pregunta:preguntas){
           RepresentacionAnalizada presentacionAnalizada=analizador.analizar(pregunta.getRepresentacionTextual(), TipoAnalisis.PREGUNTA);
           pregunta.getRepresentaciones().add(presentacionAnalizada);
           gestorAlmacenamiento.almacenar(pregunta);
        }

    }

    public void eliminarPregunta(long id){

    }

    public Pregunta recuperarPregunta(long id){

        Pregunta pregunta= new Pregunta();
        return pregunta;

    }

    public List<Pregunta> recuperarConsulta(Consulta consulta){

            return null;
    }





}
