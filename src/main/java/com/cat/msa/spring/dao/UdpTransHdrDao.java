/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.spring.dao;

import com.cat.msa.mapper.UdpTransHdrMapper;
import com.cat.msa.model.UdpTransHdr;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salisa Hongsi
 */

@Component
public class UdpTransHdrDao {
    DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private UdpTransHdrMapper mapper;
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    public void setMapper(UdpTransHdrMapper mapper) {
        this.mapper = mapper;
    }
    
    
    
    public List<UdpTransHdr> listUdpTransHdr(){
        String sql = "select * from UPD_OFFER_LOADER_HDR ";
        List<UdpTransHdr> UdpTransHdrs = jdbcTemplate.query(sql, mapper);
        return UdpTransHdrs;
    }
    
    public UdpTransHdr findUdpTransHdrByFileId(String fileId){
        String sql = " select * from UPD_OFFER_LOADER_HDR where file_id = ? ";
        UdpTransHdr queryForObject = jdbcTemplate.queryForObject(sql, mapper);
        return queryForObject;
    }
    
    public void insert(UdpTransHdr udpTransHdr){
        String sql = "insert into UPD_OFFER_LOADER_HDR(file_id,file_name,chg_by,req_date) "
                + "values(UDP_OFFER_FILE_LOADER_SEQ.next,?,?,sydate)";
        int update = jdbcTemplate.update(sql, udpTransHdr.getFileName(),udpTransHdr.getChgBy());
    }
    
    
            
    
}
