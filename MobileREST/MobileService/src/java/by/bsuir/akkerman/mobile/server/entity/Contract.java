package by.bsuir.akkerman.mobile.server.entity;
// Generated 07.12.2015 0:24:44 by Hibernate Tools 4.3.1


import by.bsuir.akkerman.mobile.server.dao.EntityHelper;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Contract generated by hbm2java
 */
public class Contract extends EntityHelper implements java.io.Serializable {

     private Integer id;
     private TypePerson typePerson;
     private int contractNumber;
     private Date dateOfConclusion;
     private int telephoneNumber;
     private String surnameClient;
     private String nameClient;
     private String patronymicClient;
     private Set<Subscriber> subscribers = new HashSet<Subscriber>(0);
     private Set<TypePerson> child = new HashSet<>(0); 

    public Contract() {
    }

	
    public Contract(TypePerson typePerson, int contractNumber, Date dateOfConclusion, int telephoneNumber, String surnameClient, String nameClient) {
        this.typePerson = typePerson;
        this.contractNumber = contractNumber;
        this.dateOfConclusion = dateOfConclusion;
        this.telephoneNumber = telephoneNumber;
        this.surnameClient = surnameClient;
        this.nameClient = nameClient;
    }
    public Contract(TypePerson typePerson, int contractNumber, Date dateOfConclusion, int telephoneNumber, String surnameClient, String nameClient, String patronymicClient, Set<Subscriber> subscribers) {
       this.typePerson = typePerson;
       this.contractNumber = contractNumber;
       this.dateOfConclusion = dateOfConclusion;
       this.telephoneNumber = telephoneNumber;
       this.surnameClient = surnameClient;
       this.nameClient = nameClient;
       this.patronymicClient = patronymicClient;
       this.subscribers = subscribers;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TypePerson getTypePerson() {
        return this.typePerson;
    }
    
    public void setTypePerson(TypePerson typePerson) {
        this.typePerson = typePerson;
    }
    public int getContractNumber() {
        return this.contractNumber;
    }
    
    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }
    public Date getDateOfConclusion() {
        return this.dateOfConclusion;
    }
    
    public void setDateOfConclusion(Date dateOfConclusion) {
        this.dateOfConclusion = dateOfConclusion;
    }
    public int getTelephoneNumber() {
        return this.telephoneNumber;
    }
    
    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String getSurnameClient() {
        return this.surnameClient;
    }
    
    public void setSurnameClient(String surnameClient) {
        this.surnameClient = surnameClient;
    }
    public String getNameClient() {
        return this.nameClient;
    }
    
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public String getPatronymicClient() {
        return this.patronymicClient;
    }
    
    public void setPatronymicClient(String patronymicClient) {
        this.patronymicClient = patronymicClient;
    }
    public Set<Subscriber> getSubscribers() {
        return this.subscribers;
    }
    
    public void setSubscribers(Set<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }


    @Override
    public Set<TypePerson> getChild() {
        child.add(this.getTypePerson());
        return child;
    }

    @Override
    public Set<Subscriber> getParent() {
        return getSubscribers();
    }

    @Override
    public int getId() {
        return this.id;
    }


}


