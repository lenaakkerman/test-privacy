/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.akkerman.mobile.server.dao;


import by.bsuir.akkerman.mobile.server.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lena
 */
public class DaoUniversal {     

    public boolean add(EntityHelper obj){ 
        boolean isSuccessfully = false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
        Session session = sessionFactory.openSession(); 
        session.beginTransaction(); 
        try{ 
            session.save(obj);
            if(obj.getParent() != null){ 
                Set<EntityHelper> set = new HashSet(obj.getParent());
                for (Iterator it = set.iterator(); it.hasNext();) {
                    EntityHelper parent_obj = (EntityHelper) session.get(it.next().getClass(), ((EntityHelper)it.next()).getId());
                    parent_obj.getChild().add(obj); 
                    session.update(parent_obj); 
                }
            } 
            isSuccessfully = true; 
        } 
        catch(HibernateException ex){ 
            System.out.println(ex.getMessage());
        } 
        finally{ 
            session.getTransaction().commit();
        } 
        return isSuccessfully; 
    }
    
    public List<EntityHelper> read(EntityHelper obj){ 
        List<EntityHelper> objectsList = new ArrayList<>();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
        Session session = sessionFactory.openSession(); 
        session.beginTransaction(); 
        try{ 
            objectsList = session.createQuery("from "+ obj.getClass().getSimpleName()).list();           
        } 
        catch(HibernateException ex){ 
            System.out.println(ex.getMessage());
        } 
        finally{ 
            session.close();
        } 
        return objectsList; 
    }
    
    public boolean delete(EntityHelper obj){
        boolean isSuccessfully = false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession(); 
        session.beginTransaction(); 
        try{ 
            obj = (EntityHelper) session.get(obj.getClass(),obj.getId());
            session.delete(obj); 
            if(!obj.getParent().isEmpty()){ 
                Set<EntityHelper> set = new HashSet(obj.getParent());
                for (Iterator it = set.iterator(); it.hasNext();) {
                    EntityHelper parent_obj = (EntityHelper) session.get(it.next().getClass(), ((EntityHelper)it.next()).getId());
                    parent_obj.getChild().add(obj); 
                    session.update(parent_obj); 
                }
            } 
            if(obj.getParent()!=null){ 
                Set<EntityHelper> set = new HashSet(obj.getParent());
                for (Iterator it = set.iterator(); it.hasNext();) {
                    String[] lines = it.next().getClass().getName().split("_");
                    EntityHelper parent_obj = (EntityHelper) session.get(lines[0], ((EntityHelper)it.next()).getId()); 
                    parent_obj.getChild().remove(obj); 
                    session.update(parent_obj); 
                }
                
            }
            isSuccessfully = true;
        }
        catch(HibernateException ex){ 
            System.out.println(ex.getMessage());
        } 
        finally{ 
            session.getTransaction().commit();
            session.close();
        } 
        return isSuccessfully;
    }
    
    public boolean update(EntityHelper obj){
        boolean isSuccessfully = false;        
        return isSuccessfully;
    }
} 

