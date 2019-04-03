package com.zzz.oj.problem.entity;

import com.zzz.oj.core.entity.OJEntity;
import com.zzz.oj.problem.enums.ProblemStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by zhizhao.zhang on 2019/04/04 03:28.
 * Description:
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Problem extends OJEntity {
    private String title;
    @Enumerated(EnumType.STRING)
    private ProblemStatus status;
    private Boolean isOIType;
    private Long submitNum;
    private Long acceptNum;
    private String content;
    private String inputDes;
    private String outputDes;
    private String inputTmp;
    private String outputTmp;
    private String source;
    private String tips;
    private Long timeLimit;
    private Long memoryLimit;
    private Long language;
}
