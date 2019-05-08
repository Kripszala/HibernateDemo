/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krips.service;

import com.krips.model.adduser_model;
import com.krips.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Kripalsinh
 */
public class adduser_service {
    public int adduser(adduser_model am){
        try{
            Session session =NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(this);
            session.getTransaction().commit();
            session.close();
            return 1;
        }catch(HibernateException e){
            System.out.println(e);
            return 0;
        }
    }
}
