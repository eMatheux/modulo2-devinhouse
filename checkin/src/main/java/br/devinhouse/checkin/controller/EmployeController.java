package br.devinhouse.checkin.controller;

import br.devinhouse.checkin.dto.EmployeDTO;
import br.devinhouse.checkin.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class EmployeController {

    private final EmployeService employeService;

    @Autowired
    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @PostMapping
    public ResponseEntity<String> registerFuncionario(@Validated @RequestBody EmployeDTO employeDTO) {
        employeService.registerEmployeer(employeDTO);
        return new ResponseEntity<>("Funcionário cadastrado com sucesso", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<EmployeDTO>> getAllEmployers(@RequestParam(defaultValue = "0") int page) {
        Page<EmployeDTO> employersPages = employeService.listEmployers(page);
        return ResponseEntity.ok(employersPages);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeDTO> buscarDetalhesEmployee(@PathVariable Long id) {
        EmployeDTO employeeDTO = employeService.buscarDetalhesEmployee(id);
        return ResponseEntity.ok(employeeDTO);
    }
}
