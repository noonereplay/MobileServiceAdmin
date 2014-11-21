/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.config;

import com.cat.msa.model.UdpTransHdr;
import com.cat.msa.spring.dao.UdpTransHdrDao;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 *
 * @author Salisa Hongsi
 */
@Configuration
@Import({InfraConfig.class})
@ComponentScan(basePackages="com.cat.msa.spring.dao,com.cat.msa.mapper")
public class MsaConfig {
    


}
