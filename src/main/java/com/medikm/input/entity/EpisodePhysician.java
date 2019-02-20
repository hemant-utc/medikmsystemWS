/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "episode_physician")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EpisodePhysician.findAll", query = "SELECT e FROM EpisodePhysician e") })
public class EpisodePhysician implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected EpisodePhysicianPK episodePhysicianPK;
	@Lob
	@Column(name = "Physican_Notes")
	private String physicanNotes;
	@Column(name = "Date_Of_First_P_Encounter")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfFirstPEncounter;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Physician physician;
	@JoinColumn(name = "Episode_Id", referencedColumnName = "Episode_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Episode episode;

	public EpisodePhysician() {
	}

	public EpisodePhysician(EpisodePhysicianPK episodePhysicianPK) {
		this.episodePhysicianPK = episodePhysicianPK;
	}

	public EpisodePhysician(int episodeId, int physicianId) {
		this.episodePhysicianPK = new EpisodePhysicianPK(episodeId, physicianId);
	}

	public EpisodePhysicianPK getEpisodePhysicianPK() {
		return episodePhysicianPK;
	}

	public void setEpisodePhysicianPK(EpisodePhysicianPK episodePhysicianPK) {
		this.episodePhysicianPK = episodePhysicianPK;
	}

	public String getPhysicanNotes() {
		return physicanNotes;
	}

	public void setPhysicanNotes(String physicanNotes) {
		this.physicanNotes = physicanNotes;
	}

	public Date getDateOfFirstPEncounter() {
		return dateOfFirstPEncounter;
	}

	public void setDateOfFirstPEncounter(Date dateOfFirstPEncounter) {
		this.dateOfFirstPEncounter = dateOfFirstPEncounter;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (episodePhysicianPK != null ? episodePhysicianPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EpisodePhysician)) {
			return false;
		}
		EpisodePhysician other = (EpisodePhysician) object;
		if ((this.episodePhysicianPK == null && other.episodePhysicianPK != null)
				|| (this.episodePhysicianPK != null && !this.episodePhysicianPK.equals(other.episodePhysicianPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EpisodePhysician[ episodePhysicianPK=" + episodePhysicianPK + " ]";
	}

}
