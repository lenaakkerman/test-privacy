/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.akkerman.mobile.server.dao;

import java.util.Collection;
import java.util.Set;

/**
 *
 * @author Lena
 */
public abstract class EntityHelper { 
    public abstract int getId(); 
    public abstract Collection getChild(); 
    public abstract Collection getParent(); 
}
