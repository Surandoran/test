package com.scot.controller;

import com.scot.domain.Emp;
import com.scot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpController {

    private final EmpService empService;

    public EmpController(@Autowired EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/emp/all")
    public List<Emp> selectAllEmp() {
        return empService.selectAll();
    }

    @PostMapping("/emp/new")
    public List<Emp> insertEmp(@RequestBody Emp emp) {

        empService.insert(emp);

        return empService.selectAll();
    }

    @PutMapping("emp/{empno}")
    public List<Emp> updateEmp1(@PathVariable Integer empno, @RequestBody Emp emp) {

        empService.update(empno, emp);

        return empService.selectAll();

    }

    @DeleteMapping("emp/{empno}")
    public List<Emp> deleteEmp(@PathVariable Integer empno) {

        empService.delete(empno);
        return empService.selectAll();
    }
}
