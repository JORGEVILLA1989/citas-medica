package com.hospital.citas_medicas.controller;

import com.hospital.citas_medicas.model.Cita;
import com.hospital.citas_medicas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping
    public Cita crearCita(@RequestBody Cita cita) {
        return citaService.guardarCita(cita);
    }

    @GetMapping
    public List<Cita> listarCitas() {
        return citaService.listarCitas();
    }

    @GetMapping("/{id}")
    public Cita buscarCita(@PathVariable Long id) {
        return citaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarCita(@PathVariable Long id) {
        citaService.eliminarCita(id);
        return "Cita eliminada correctamente";
    }
}