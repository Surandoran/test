package com.scot.mapper;

import com.scot.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<Emp> selectAll();
    Emp selectByEmpno(int empno);
    void insert(Emp emp);
    void update(Emp emp);
    void delete(int empno);

}
