package br.edu.ifrs.riogrande.tads.ppa.cobaia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.ifrs.riogrande.tads.ppa.cobaia.model.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.cobaia.repository.DisciplinaRepository;


@Controller
public class DisciplinaController {
    
    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaController(DisciplinaRepository repo) {
        this.disciplinaRepository = repo;
    }

    @GetMapping("/web/disciplinas")
    public String viewDisciplinas(Model model) {
        model.addAttribute("disciplinas", disciplinaRepository.findAll());
        return "disciplina/lista";
    }

    @GetMapping("/api/disciplinas")
    @ResponseBody
    public ResponseEntity<List<Disciplina>> getDisciplinas() {
        return ResponseEntity.ok(disciplinaRepository.findAll());
    }

}
