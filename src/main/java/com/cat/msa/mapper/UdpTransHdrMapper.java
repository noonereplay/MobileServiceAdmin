/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.mapper;

import com.cat.msa.model.UdpTransHdr;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salisa Hongsi
 */

@Component
public class UdpTransHdrMapper implements RowMapper<UdpTransHdr>{



    @Override
    public UdpTransHdr mapRow(ResultSet rs, int i) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        UdpTransHdr udpTransHdr = new UdpTransHdr();
        udpTransHdr.setFileId(rs.getInt("FILE_ID"));
        udpTransHdr.setFileName(rs.getString("FILE_NAME"));
        udpTransHdr.setChgBy(rs.getString("CHG_BY"));
        udpTransHdr.setReqDate(rs.getDate("REQ_DATE"));
        return udpTransHdr;
    }
    
}
