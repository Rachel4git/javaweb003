package com.atrachel.model;


import com.atrachel.controller.ListAllZoneServlet;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by hd48552 on 2018/5/8.
 */

public class ZoneDAOTest {
    @Test
    public void releaseConnect() throws Exception {
        new ZoneDAO().creatConnect();
    }

    @Test
    public void delete() {
        new ZoneDAO().delete(285);
    }

}
