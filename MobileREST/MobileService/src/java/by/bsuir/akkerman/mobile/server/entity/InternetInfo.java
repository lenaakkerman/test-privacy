package by.bsuir.akkerman.mobile.server.entity;
// Generated 07.12.2015 0:24:44 by Hibernate Tools 4.3.1


import by.bsuir.akkerman.mobile.server.dao.EntityHelper;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * InternetInfo generated by hbm2java
 */
public class InternetInfo extends EntityHelper implements java.io.Serializable {


     private Integer id;
     private Subscriber subscriber;
     private Date sessionDate;
     private int trafficUsed;
     private Set<Subscriber> child = new HashSet<>(0); 

    public InternetInfo() {
    }

    public InternetInfo(Subscriber subscriber, Date sessionDate, int trafficUsed) {
       this.subscriber = subscriber;
       this.sessionDate = sessionDate;
       this.trafficUsed = trafficUsed;
    }
   
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Subscriber getSubscriber() {
        return this.subscriber;
    }
    
    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }
    public Date getSessionDate() {
        return this.sessionDate;
    }
    
    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }
    public int getTrafficUsed() {
        return this.trafficUsed;
    }
    
    public void setTrafficUsed(int trafficUsed) {
        this.trafficUsed = trafficUsed;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Collection getChild() {
        child.add(subscriber);
        return child;
    }

    @Override
    public Collection getParent() {
        return null;
    }




}


