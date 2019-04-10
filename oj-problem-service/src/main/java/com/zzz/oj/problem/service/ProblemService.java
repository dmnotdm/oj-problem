package com.zzz.oj.problem.service;

import com.zzz.oj.problem.entity.Problem;
import com.zzz.util.jpa.service.JpaService;

import org.springframework.stereotype.Service;

/**
 * Created by zhizhao.zhang on 2019/04/10 13:51.
 * Description:
 */
@Service
public class ProblemService extends JpaService<Long, Problem> {
    @Override
    public Problem createNew(Problem problem) {
        if (problem.isInvalid()) {
            return null;
        }
        if (problem.getSubmitNum() == null) {
            problem.setSubmitNum(0L);
        }
        if (problem.getAcceptNum() == null) {
            problem.setAcceptNum(0L);
        }
        if (problem.getIsOiType() == null) {
            problem.setIsOiType(Boolean.FALSE);
        }
        if (problem.getLanguage() == null) {
            problem.setLanguage(0L);
        }
        problem.setId(null);

        problem = repository.save(problem);

        return problem;
    }
}
