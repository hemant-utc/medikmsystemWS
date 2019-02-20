/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "disease_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiseaseType.findAll", query = "SELECT d FROM DiseaseType d")})
public class DiseaseType implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "Disease_Type_Id")
    private Integer diseaseTypeId;
    @Column(name = "Disease_Name")
    private String diseaseName;
    @OneToMany(mappedBy = "diseaseType")
    private Collection<Case1> caseCollection;
    @OneToMany(mappedBy = "diseaseTypeId")
    private Collection<Physician> physicianCollection;
    @OneToMany(mappedBy = "diseasetypeId")
    private Collection<CancerType> cancerTypeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diseaseType")
    private Collection<MedikmResources> medikmResourcesCollection;
    @OneToMany(mappedBy = "diseaseTypeId")
    private Collection<ServiceProvider> serviceProviderCollection;
    @OneToMany(mappedBy = "diseaseTypeId")
    private Collection<User> userCollection;

    public DiseaseType() {
    }

    public DiseaseType(Integer diseaseTypeId) {
        this.diseaseTypeId = diseaseTypeId;
    }

    public Integer getDiseaseTypeId() {
        return diseaseTypeId;
    }

    public void setDiseaseTypeId(Integer diseaseTypeId) {
        this.diseaseTypeId = diseaseTypeId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @XmlTransient
    public Collection<Physician> getPhysicianCollection() {
        return physicianCollection;
    }

    public void setPhysicianCollection(Collection<Physician> physicianCollection) {
        this.physicianCollection = physicianCollection;
    }

    @XmlTransient
    public Collection<CancerType> getCancerTypeCollection() {
        return cancerTypeCollection;
    }

    public void setCancerTypeCollection(Collection<CancerType> cancerTypeCollection) {
        this.cancerTypeCollection = cancerTypeCollection;
    }

    @XmlTransient
    public Collection<MedikmResources> getMedikmResourcesCollection() {
        return medikmResourcesCollection;
    }

    public void setMedikmResourcesCollection(Collection<MedikmResources> medikmResourcesCollection) {
        this.medikmResourcesCollection = medikmResourcesCollection;
    }

    @XmlTransient
    public Collection<ServiceProvider> getServiceProviderCollection() {
        return serviceProviderCollection;
    }

    public void setServiceProviderCollection(Collection<ServiceProvider> serviceProviderCollection) {
        this.serviceProviderCollection = serviceProviderCollection;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diseaseTypeId != null ? diseaseTypeId.hashCode() : 0);
        return hash;
    }

    
    
    /**
	 * @return the caseCollection
	 */
	public Collection<Case1> getCaseCollection() {
		return caseCollection;
	}

	/**
	 * @param caseCollection the caseCollection to set
	 */
	public void setCaseCollection(Collection<Case1> caseCollection) {
		this.caseCollection = caseCollection;
	}

	@Override
    public boolean equals(Object object) {
        if (!(object instanceof DiseaseType)) {
            return false;
        }
        DiseaseType other = (DiseaseType) object;
        if ((this.diseaseTypeId == null && other.diseaseTypeId != null) || (this.diseaseTypeId != null && !this.diseaseTypeId.equals(other.diseaseTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.medikm.input.entity.DiseaseType[ diseaseTypeId=" + diseaseTypeId + " ]";
    }
    
}
