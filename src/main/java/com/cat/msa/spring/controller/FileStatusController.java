/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.spring.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Salisa Hongsi
 */

@Controller
@RequestMapping
public class FileStatusController {
    
    
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model){
        System.out.println("Test......................");
        return "index";
    }

    
     @RequestMapping(value="/test", method=RequestMethod.GET)
    public String test(Model model){
        System.out.println("Test......................");
        return "index";
    }
    
    @RequestMapping(value="/changeso/upload", method=RequestMethod.POST)
    public String handleFileUpload(Model model,@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(name + "-uploaded")));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + " into " + name + "-uploaded !";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "error";
        }
    }
    
    

}
