/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Salisa Hongsi
 */
@Controller
public class UpdateOfferContoller {
    
    
    @RequestMapping(value="/ChangeSo1/{file_id}", produces="text/plain")
    public String changeSo1(){
        return "change_so";
    }
    
    
}
