package com.hospital.citas_medicas.service;

import com.hospital.citas_medicas.model.Cita;
import com.hospital.citas_medicas.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public Cita guardarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public List<Cita> listarCitas() {
        return citaRepository.findAll();
    }

    public Cita buscarPorId(Long id) {
        return citaRepository.findById(id).orElse(null);
    }

    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}
