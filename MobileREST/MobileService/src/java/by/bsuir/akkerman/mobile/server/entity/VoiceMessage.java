package by.bsuir.akkerman.mobile.server.entity;
// Generated 07.12.2015 0:24:44 by Hibernate Tools 4.3.1


import by.bsuir.akkerman.mobile.server.dao.EntityHelper;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VoiceMessage generated by hbm2java
 */
public class VoiceMessage extends EntityHelper implements java.io.Serializable {


     private Integer id;
     private Subscriber subscriberByToSubscriberId;
     private Subscriber subscriberByFromSubscriberId;
     private Date messageDate;
     private Set<Subscriber> child = new HashSet<>(0); 

    public VoiceMessage() {
    }

    public VoiceMessage(Subscriber subscriberByToSubscriberId, Subscriber subscriberByFromSubscriberId, Date messageDate) {
       this.subscriberByToSubscriberId = subscriberByToSubscriberId;
       this.subscriberByFromSubscriberId = subscriberByFromSubscriberId;
       this.messageDate = messageDate;
    }
   
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Subscriber getSubscriberByToSubscriberId() {
        return this.subscriberByToSubscriberId;
    }
    
    public void setSubscriberByToSubscriberId(Subscriber subscriberByToSubscriberId) {
        this.subscriberByToSubscriberId = subscriberByToSubscriberId;
    }
    public Subscriber getSubscriberByFromSubscriberId() {
        return this.subscriberByFromSubscriberId;
    }
    
    public void setSubscriberByFromSubscriberId(Subscriber subscriberByFromSubscriberId) {
        this.subscriberByFromSubscriberId = subscriberByFromSubscriberId;
    }
    public Date getMessageDate() {
        return this.messageDate;
    }
    
    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Collection getChild() {
        child.add(getSubscriberByFromSubscriberId());
        child.add(getSubscriberByToSubscriberId());
        return child;
    }

    @Override
    public Collection getParent() {
        return null;
    }




}


