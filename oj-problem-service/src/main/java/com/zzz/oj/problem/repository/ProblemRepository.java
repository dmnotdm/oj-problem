package com.zzz.oj.problem.repository;

import com.zzz.oj.problem.entity.Problem;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhizhao.zhang on 2019/04/11 23:39.
 * Description:
 */
public interface ProblemRepository extends JpaRepository<Problem, Long> {
}
