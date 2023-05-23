package com.example.jishixingle.ctrl;


import com.example.jishixingle.dao.ClassificationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("class")
public class ClassificationController {

    @Autowired
    private ClassificationDAO classificationDAO;

    @RequestMapping("/uploadimg")
    public String uploadimg(MultipartFile file){


        return "";
    }




}
