package by.bsuir.akkerman.mobile.server.entity;
// Generated 07.12.2015 0:24:44 by Hibernate Tools 4.3.1


import by.bsuir.akkerman.mobile.server.dao.EntityHelper;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CallInfo generated by hbm2java
 */
public class CallInfo extends EntityHelper implements java.io.Serializable {


     private Integer id;
     private Subscriber subscriberByFromSubscriberId;
     private Subscriber subscriberByToSubscriberId;
     private Date callDate;
     private Date callTime;
     private Date duration;
     private Set<Subscriber> child = new HashSet<>(0); 
     public Integer lenka;

    public CallInfo() {
    }

    public CallInfo(Subscriber subscriberByFromSubscriberId, Subscriber subscriberByToSubscriberId, Date callDate, Date callTime, Date duration) {
       this.subscriberByFromSubscriberId = subscriberByFromSubscriberId;
       this.subscriberByToSubscriberId = subscriberByToSubscriberId;
       this.callDate = callDate;
       this.callTime = callTime;
       this.duration = duration;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Subscriber getSubscriberByFromSubscriberId() {
        return this.subscriberByFromSubscriberId;
    }
    
    public void setSubscriberByFromSubscriberId(Subscriber subscriberByFromSubscriberId) {
        this.subscriberByFromSubscriberId = subscriberByFromSubscriberId;
    }
    public Subscriber getSubscriberByToSubscriberId() {
        return this.subscriberByToSubscriberId;
    }
    
    public void setSubscriberByToSubscriberId(Subscriber subscriberByToSubscriberId) {
        this.subscriberByToSubscriberId = subscriberByToSubscriberId;
    }
    public Date getCallDate() {
        return this.callDate;
    }
    
    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }
    public Date getCallTime() {
        return this.callTime;
    }
    
    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }
    public Date getDuration() {
        return this.duration;
    }
    
    public void setDuration(Date duration) {
        this.duration = duration;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Collection getChild() {
        child.add(this.getSubscriberByFromSubscriberId());
        child.add(this.getSubscriberByToSubscriberId());
        return child;
    }

    @Override
    public Collection getParent() {
        return null;
    }




}


