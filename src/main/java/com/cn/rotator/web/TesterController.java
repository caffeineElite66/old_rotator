package com.cn.rotator.web;

import com.cn.rotator.domain.Tester;
import com.cn.rotator.service.JpaTesterService;
import com.cn.rotator.service.TesterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cn.rotator.service.TesterServiceImpl;

import javax.inject.Inject;
import java.util.Date;

/**
 * User: kevin
 * Date: 1/16/11
 * Time: 10:37 PM
 */
@Controller
@RequestMapping(value = "/tester")
public class TesterController {

    private TesterService testerService = new JpaTesterService();

    @Inject
    public TesterController(TesterService testerService) {
        this.testerService = testerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(Model model) {
        Tester t = new Tester(new Date());
        testerService.create(t);
        model.addAttribute(t);
        return "tester/test";
    }
}
