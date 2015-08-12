package com.rohan.model;

import java.util.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * The Class BaseEntity.
 */
public class BaseEntity {
	
	/** The id. */
	private Long id;
	
	/** The version. */
	private Integer version;
	
	/** The created. */
	private Date created;
	
	/** The last updated. */
	private Date lastUpdated;
	
	/** The activeflag. */
	protected Boolean activeflag;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	@Version
	@Column(name="version")
	public Integer getVersion() {
		return version;
	}
	
	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	/**
	 * Gets the created.
	 *
	 * @return the created
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created", columnDefinition="dateTime default TIME_STAMP")
	public Date getCreated() {
		if(this.created==null){
			this.created = Calendar.getInstance().getTime();
		}
		return created;
	}
	
	/**
	 * Sets the created.
	 *
	 * @param created the new created
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	
	/**
	 * Gets the last updated.
	 *
	 * @return the last updated
	 */
	@Column(name="lastUpdated", columnDefinition="datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	public Date getLastUpdated() {
		if(lastUpdated==null){
			lastUpdated = Calendar.getInstance().getTime();
		}
		return lastUpdated;
	}
	
	/**
	 * Sets the last updated.
	 *
	 * @param lastUpdated the new last updated
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	/**
	 * Gets the activeflag.
	 *
	 * @return the activeflag
	 */
	@Column(name="activeflag", columnDefinition="default 1")
	public Boolean getActiveflag() {
		return activeflag;
	}
	
	/**
	 * Sets the activeflag.
	 *
	 * @param activeflag the new activeflag
	 */
	public void setActiveflag(Boolean activeflag) {
		this.activeflag = activeflag;
	}

}
