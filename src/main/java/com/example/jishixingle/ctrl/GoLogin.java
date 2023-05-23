package com.example.jishixingle.ctrl;


import com.example.jishixingle.dao.ClassificationDAO;
import com.example.jishixingle.model.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class GoLogin {

    @Autowired
    private ClassificationDAO classificationDAO;

    @RequestMapping
    public String goLogin(Model model){
        List<Classification> classificationList = classificationDAO.selectClassificationAll();
        model.addAttribute("classificationList",classificationList);
        return "login";
    }

}
