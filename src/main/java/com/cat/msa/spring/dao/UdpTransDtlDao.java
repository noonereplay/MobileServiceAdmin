/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.spring.dao;

import com.cat.msa.mapper.UdpTransDtlMapper;
import com.cat.msa.model.UdpTransDtl;
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
public class UdpTransDtlDao {
    DataSource dataSource;
    
    private JdbcTemplate jdbcTemplate;
    private UdpTransDtlMapper mapper;
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    public void setMapper(UdpTransDtlMapper mapper) {
        this.mapper = mapper;
    }
    
    public void insert(UdpTransDtl udpTransDtl){
        String sql = "insert into UPD_OFFER_LOADER_DTL(trans_ref,msisdn,offer_id,file_id,req_date) "
                + "values(?,?,?,?,sydate)";
        int update = jdbcTemplate.update(sql, udpTransDtl.getTransRef(), udpTransDtl.getMsisdn(),udpTransDtl.getOfferId(),udpTransDtl.getFileId());
    }
    
    public List<UdpTransDtl> findUdpTransDtlByFileId(int file_id){
        String sql = "select * from UPD_OFFER_LOADER_DTL where file_id = ? ";
        List<UdpTransDtl> udpTransDtls = jdbcTemplate.query(sql,new Object[]{file_id}, mapper);
        return udpTransDtls;
    }
    
    public List<UdpTransDtl> findUdpTransDtlByMsisdn(int msisdn){
        String sql = "select * from UPD_OFFER_LOADER_DTL where msisdn = ? ";
        List<UdpTransDtl> udpTransDtls = jdbcTemplate.query(sql,new Object[]{msisdn}, mapper);
        return udpTransDtls;
    }
    
}
