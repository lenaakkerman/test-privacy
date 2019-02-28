package by.bsuir.akkerman.mobile.server.entity;
// Generated 07.12.2015 0:24:44 by Hibernate Tools 4.3.1


import by.bsuir.akkerman.mobile.server.dao.EntityHelper;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * TariffPlan generated by hbm2java
 */
public class TariffPlan extends EntityHelper implements java.io.Serializable {


     private Integer id;
     private GroupTariff groupTariff;
     private String tariffName;
     private int connectionFee;
     private int callInNetFee;
     private int callOutNetFee;
     private int smsFee;
     private int mmsFee;
     private Integer includedTraffic;
     private int subscriptionFee;
     private int roamingFee;
     private Set<Subscriber> subscribers = new HashSet<Subscriber>(0);
     private Set<GroupTariff> child = new HashSet<>(0);

    public TariffPlan() {
    }

	
    public TariffPlan(String tariffName, int connectionFee, int callInNetFee, int callOutNetFee, int smsFee, int mmsFee, int subscriptionFee, int roamingFee) {
        this.tariffName = tariffName;
        this.connectionFee = connectionFee;
        this.callInNetFee = callInNetFee;
        this.callOutNetFee = callOutNetFee;
        this.smsFee = smsFee;
        this.mmsFee = mmsFee;
        this.subscriptionFee = subscriptionFee;
        this.roamingFee = roamingFee;
    }
    public TariffPlan(GroupTariff groupTariff, String tariffName, int connectionFee, int callInNetFee, int callOutNetFee, int smsFee, int mmsFee, Integer includedTraffic, int subscriptionFee, int roamingFee, Set<Subscriber> subscribers) {
       this.groupTariff = groupTariff;
       this.tariffName = tariffName;
       this.connectionFee = connectionFee;
       this.callInNetFee = callInNetFee;
       this.callOutNetFee = callOutNetFee;
       this.smsFee = smsFee;
       this.mmsFee = mmsFee;
       this.includedTraffic = includedTraffic;
       this.subscriptionFee = subscriptionFee;
       this.roamingFee = roamingFee;
       this.subscribers = subscribers;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public GroupTariff getGroupTariff() {
        return this.groupTariff;
    }
    
    public void setGroupTariff(GroupTariff groupTariff) {
        this.groupTariff = groupTariff;
    }
    public String getTariffName() {
        return this.tariffName;
    }
    
    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }
    public int getConnectionFee() {
        return this.connectionFee;
    }
    
    public void setConnectionFee(int connectionFee) {
        this.connectionFee = connectionFee;
    }
    public int getCallInNetFee() {
        return this.callInNetFee;
    }
    
    public void setCallInNetFee(int callInNetFee) {
        this.callInNetFee = callInNetFee;
    }
    public int getCallOutNetFee() {
        return this.callOutNetFee;
    }
    
    public void setCallOutNetFee(int callOutNetFee) {
        this.callOutNetFee = callOutNetFee;
    }
    public int getSmsFee() {
        return this.smsFee;
    }
    
    public void setSmsFee(int smsFee) {
        this.smsFee = smsFee;
    }
    public int getMmsFee() {
        return this.mmsFee;
    }
    
    public void setMmsFee(int mmsFee) {
        this.mmsFee = mmsFee;
    }
    public Integer getIncludedTraffic() {
        return this.includedTraffic;
    }
    
    public void setIncludedTraffic(Integer includedTraffic) {
        this.includedTraffic = includedTraffic;
    }
    public int getSubscriptionFee() {
        return this.subscriptionFee;
    }
    
    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }
    public int getRoamingFee() {
        return this.roamingFee;
    }
    
    public void setRoamingFee(int roamingFee) {
        this.roamingFee = roamingFee;
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
        child.add(groupTariff);
        return child;
    }

    @Override
    public Collection getParent() {
        return getSubscribers();
    }




}


