package com.zzz.oj.problem.controller;

import com.zzz.oj.problem.entity.Problem;
import com.zzz.util.jpa.controller.BaseController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhizhao.zhang on 2019/04/10 13:49.
 * Description:
 */
@RestController
@RequestMapping("/problem")
public class ProblemController extends BaseController<Long, Problem> {
}
