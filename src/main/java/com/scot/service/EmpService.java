package com.scot.service;

import com.scot.domain.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> selectAll();
    void insert(Emp emp);
    void update(int empno, Emp emp);
    void delete(int empno);

}
