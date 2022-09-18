package com.scot;

import com.scot.domain.Emp;
import com.scot.mapper.EmpMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class EmpMapperTest {

    private final EmpMapper mapper;

    EmpMapperTest(@Autowired EmpMapper mapper) {
        this.mapper = mapper;
    }

    @Test
    void selectAll() {

        mapper.selectAll();

    }

    @Test
    void selectByEmpno() {

        mapper.selectByEmpno(7369);

    }

    @Test
    void insert(Emp emp) {

        emp.setEname("test1");
        emp.setJob("test1");
        emp.setMgr(33);
        emp.setSal(33);
        emp.setComm(33);
        emp.setDeptno(10);

        mapper.insert(emp);
    }

    @Test
    void update(Emp emp) {

        emp.setEmpno(30);
        emp.setEname("수정");
        emp.setJob("수정");

        mapper.update(emp);

    }

    @Test
    void delete() {
        mapper.delete(7777);
    }
}