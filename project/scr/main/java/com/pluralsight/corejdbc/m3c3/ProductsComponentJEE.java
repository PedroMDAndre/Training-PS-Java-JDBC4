package com.pluralsight.corejdbc.m3c3;

import java.io.Serial;
import java.rmi.RemoteException;
import java.sql.Connection;

import javax.ejb.*;
import javax.annotation.Resource;
import javax.sql.DataSource;

public class ProductsComponentJEE implements SessionBean {
    @Serial
    private static final long serialVersionUID = 1L;

    @Resource(name = "jdbc/mySql")
    DataSource dataSource;

    public boolean getProductCount() throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            return connection.isValid(2);
        }
    }

    @Override
    public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
        // TODO Auto-generated method stub

    }
}
