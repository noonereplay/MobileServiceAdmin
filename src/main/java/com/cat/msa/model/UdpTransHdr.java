/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.model;

import java.util.Date;



/**
 *
 * @author Salisa Hongsi
 */

public class UdpTransHdr {
    
    int fileId,total;
    String fileName, chgBy;
    Date reqDate;

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getChgBy() {
        return chgBy;
    }

    public void setChgBy(String chgBy) {
        this.chgBy = chgBy;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }
    
         
}
