/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cat.msa.ws.saas.root;

import com.cat.msa.ws.saas.RestConnection;
import com.cat.msa.ws.saas.RestResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author user
 */
public class Rootsubscribers_wadl {

    /**
     * Creates a new instance of Rootsubscribers_wadl
     */
    public Rootsubscribers_wadl() {
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Throwable th) {
        }
    }

    /**
     *
     * @param msisdn
     * @param content
     * @return an instance of RestResponse
     */
    public static RestResponse modify(String msisdn, InputStream content) throws IOException {
        String[][] pathParams = new String[][]{{"{msisdn}", msisdn}};
        String[][] queryParams = new String[][]{};
        RestConnection conn = new RestConnection("http://c1rtgw.cattelecom.com/C1rtGw/api/subscribers/{msisdn}/offer/modify", pathParams, queryParams);
        conn.setAuthenticator(new BasicAuthenticator("ussd-usr", "rsu-dssu"));
        sleep(1000);
        return conn.put(null, content);
    }
}

class BasicAuthenticator extends Authenticator {
    String baName;
    String baPassword;

    public BasicAuthenticator(String baName1, String baPassword1) {
        baName = baName1;
        baPassword = baPassword1;
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        System.out.println("Authenticating...");
        return new PasswordAuthentication(baName, baPassword.toCharArray());
    }
};
