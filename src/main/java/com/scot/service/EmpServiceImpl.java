package com.scot.service;

import com.scot.domain.Emp;
import com.scot.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    private final EmpMapper mapper;

    public EmpServiceImpl(@Autowired EmpMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Emp> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Emp selectByEmpno(int empno) {
        return mapper.selectByEmpno(empno);
    }

    @Override
    public void insert(Emp emp) {
        mapper.insert(emp);
    }

    @Override
    public void update(int empno, Emp emp) {
        Emp emp1 = mapper.selectByEmpno(empno);
        if(emp1 != null) {
            emp1.setEname(emp.getEname());
            emp1.setJob(emp.getJob());
            mapper.update(empno,emp);
        } else {
        }
    }

    @Override
    public void delete(int empno) {
        if(mapper.selectByEmpno(empno) != null) {
            mapper.delete(empno);
        } else {
        }
    }
}
