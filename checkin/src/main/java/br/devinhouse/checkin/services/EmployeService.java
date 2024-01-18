package br.devinhouse.checkin.services;

import br.devinhouse.checkin.dto.EmployeDTO;
import br.devinhouse.checkin.dto.RegisterDTO;
import br.devinhouse.checkin.model.Employe;
import br.devinhouse.checkin.model.Register;
import br.devinhouse.checkin.repositories.EmployeRepository;
import br.devinhouse.checkin.repositories.RegisterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;
    private final RegisterRepository registerRepository;

    @Autowired
    public EmployeService(EmployeRepository employeRepository, RegisterRepository registerRepository) {
        this.employeRepository = employeRepository;
        this.registerRepository = registerRepository;
    }

    public Page<EmployeDTO> listEmployers(int pages) {
        PageRequest pageRequest = PageRequest.of(pages, 12);
        Page<Employe> employersPages = employeRepository.findAll(pageRequest);
        return employersPages.map(this::transformToDTO);
    }

    private EmployeDTO transformToDTO(Employe employe) {
        EmployeDTO employeDTO = new EmployeDTO();
        employeDTO.setId(employeDTO.getId());
        employeDTO.setNome(employeDTO.getNome());
        employeDTO.setCargo(employeDTO.getCargo());
        employeDTO.setSalario(employeDTO.getSalario());
        return employeDTO;
    }

    public void registerEmployeer(EmployeDTO employeDTO) {
        Employe employe = new Employe();
        BeanUtils.copyProperties(employeDTO, employe);
        employeRepository.save(employe);
    }

    public EmployeDTO buscarDetalhesEmployee(Long idEmployee) {
        Employe employee = employeRepository.findById(idEmployee)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee não encontrado com ID: " + idEmployee));

        List<RegisterDTO> registersDTO = registerRepository.findByEmployeeId(idEmployee)
                .stream()
                .map(this::converterRegisterParaDTO)
                .collect(Collectors.toList());

        return converterParaDTO(employee, registersDTO);
    }

    private RegisterDTO converterRegisterParaDTO(Register register) {
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setId(register.getId());
        registerDTO.setHoraRegistro(register.getHoraRegistro());
        registerDTO.setTipoRegistro(register.getTipoRegistro());
        return registerDTO;
    }

    private EmployeDTO converterParaDTO(Employe employee, List<RegisterDTO> registersDTO) {
        EmployeDTO employeeDTO = new EmployeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setNome(employee.getNome());
        employeeDTO.setCargo(employee.getCargo());
        employeeDTO.setSalario(employee.getSalario());
        employeeDTO.setRegistros(registersDTO);
        return employeeDTO;
    }
}