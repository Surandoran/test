package com.scot.mapper;

import com.scot.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EmpMapper {

    public List<Emp> selectAll();
    public Emp selectByEmpno(int empno);
    public void insert(Emp emp);
    public void update(int empno,Emp emp);
    public void delete(int empno);

}
