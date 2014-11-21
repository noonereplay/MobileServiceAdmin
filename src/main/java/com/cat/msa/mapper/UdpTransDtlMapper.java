/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.mapper;

import com.cat.msa.model.UdpTransDtl;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salisa Hongsi
 */


@Component
public class UdpTransDtlMapper implements RowMapper<UdpTransDtl>{

    @Override
    public UdpTransDtl mapRow(ResultSet rs, int i) throws SQLException {
        UdpTransDtl udpTransDtl = new UdpTransDtl();
        udpTransDtl.setFileId(rs.getInt("FILE_ID"));
        udpTransDtl.setMsisdn(rs.getString("MSISDN"));
        udpTransDtl.setOfferId(rs.getString("OFFER_ID"));
        udpTransDtl.setTransRef(rs.getString("TRANS_REF"));
        udpTransDtl.setReqDate(rs.getDate("REQ_DATE"));
        return udpTransDtl;
    }
}
