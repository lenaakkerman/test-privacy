package by.bsuir.akkerman.mobile.server.entity;
// Generated 07.12.2015 0:24:44 by Hibernate Tools 4.3.1


import by.bsuir.akkerman.mobile.server.dao.EntityHelper;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * CallForwarding generated by hbm2java
 */
public class CallForwarding extends EntityHelper implements java.io.Serializable {


     private Integer id;
     private String status;
     private Integer forwardingNumber;
     private Set<Subscriber> subscribers = new HashSet<Subscriber>(0);
     
    public CallForwarding() {
    }

	
    public CallForwarding(String status) {
        this.status = status;
    }
    public CallForwarding(String status, Integer forwardingNumber, Set<Subscriber> subscribers) {
       this.status = status;
       this.forwardingNumber = forwardingNumber;
       this.subscribers = subscribers;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getForwardingNumber() {
        return this.forwardingNumber;
    }
    
    public void setForwardingNumber(Integer forwardingNumber) {
        this.forwardingNumber = forwardingNumber;
    }
    public Set<Subscriber> getSubscribers() {
        return this.subscribers;
    }
    
    public void setSubscribers(Set<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Collection getChild() {
        return null;
    }

    @Override
    public Collection getParent() {
        return getSubscribers();
    }




}


