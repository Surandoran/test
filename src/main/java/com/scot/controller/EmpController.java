package com.scot.controller;

import com.scot.domain.Emp;
import com.scot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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

        //{
        //    "empno" : 1111,
        //    "ename" : "Zidane1233",
        //    "job" : "test33",
        //    "mgr" : 11,
        //    "sal" : 111,
        //    "comm" : 111,
        //    "deptno" : 10
        //}
    }

    @PutMapping("/emp/{empno}")
    public List<Emp> updateEmp1(@PathVariable Integer empno, @RequestBody Emp emp) {

        empService.update(empno, emp);

        return empService.selectAll();

        //"empno" : 30,
        //    "ename" : "test",
        //    "job" : "test"

    }

    @DeleteMapping("/emp/{empno}")
    public List<Emp> deleteEmp(@PathVariable Integer empno) {

        empService.delete(empno);
        return empService.selectAll();

    }
}
