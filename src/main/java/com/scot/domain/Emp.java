package com.scot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDateTime hiredate;
    private Integer sal;
    private Integer comm;
    private Integer deptno;



}
