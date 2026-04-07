package com.example.FitLifeTech.repository;

import com.example.FitLifeTech.model.Rutina;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RutinaRepository {

    private List<Rutina> ListaRutina = new ArrayList<>();

    public Rutina saveRutina(Rutina rutina) {
        // Lógica para guardar la rutina en la base de datos
        ListaRutina.add(rutina);
        return rutina;
    }

    public List<Rutina> getAllRutinas() {
        // Lógica para obtener todas las rutinas de la base de datos
        return ListaRutina;
    }

    public Rutina obtenerPorId(int idRutina){

        for(Rutina rutina : ListaRutina){
            if(rutina.getId() == idRutina){
                return rutina;
            }
        }
        return null;

    }

    public  Rutina modificarRutina(Rutina rutina){
        int idRutina =0;
        int idPosicion = 0;

        for ( i  = 0; i<ListaRutina.size(); i++)(){

            if(ListaRutina.get(i).getId() == rutina.getId()){
                idRutina = = rutina.getId();
                idPosicion = i;
            }
        }
        Rutina rutinaActualizada = new Rutina();
        rutinaActualizada.setId(idRutina);
        rutinaActualizada.setUsuario(rutina.getUsuario());
        rutinaActualizada.setDuracion(rutina.getDuracion());
        rutinaActualizacion.setIntensidad(rutina.getIntensidad());
        rutinaActualizada.setTipoEntrenamiento(rutina.getTipoEntrenamiento());
        rutinaActualizada.setFechaPlanificacion(rutina.getFechaPlanificacion());
        rutinaActualizada.setEstado(rutina.getEstado());

        listaRutina.set(idPosicion, rutinaActualizada);
        return rutinaActualizada;
    }

    public void eliminarRutina(int idRutina){
        listaRutina.removeIf(rutina -> rutina.getId() == idRutina);
    }

    public List<Rutina> ordenarFechaPlanificacion(){
        listaRutina.sort(Comparador.comparing(Rutina::getFechaPlanificacion)).reverse;
        return listaRutina;
        

    }

    public List<Rutina> ordenarIntensidad(){
        listaRutina.sort(Comparador.comparing(Rutina::getIntensidad)).reverse;
        return listaRutina;
    }

    public List<Rutina> filtrarPorIntensidad(String intensidad){
        List<Rutina> rutinaFiltrada = new ArrayList<>();
        for (Rutina rutina : listaRutina){
            if(rutina.getIntensidad().equalsIgnoreCase(intensidad)){
                rutinaFiltrada.add(rutina);
            }
        }
        return rutinaFiltrada;
    }




}
