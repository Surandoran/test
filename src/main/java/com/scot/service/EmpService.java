package com.scot.service;

import com.scot.domain.Emp;

import java.util.List;

public interface EmpService {

    public List<Emp> selectAll();
    public Emp selectByEmpno(int empno);
    public void insert(Emp emp);
    public void update(int empno, Emp emp);
    public void delete(int empno);

}
