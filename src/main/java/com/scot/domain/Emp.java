package com.scot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Emp {

    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDateTime createAt;
    private Integer sal;
    private Integer comm;
    private Integer deptno;

}
