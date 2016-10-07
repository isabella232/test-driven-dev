package com.apress.tddbook.ejb;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface FBPoolServerHome extends EJBHome {
  FBPoolServer create() throws RemoteException, CreateException;
}

