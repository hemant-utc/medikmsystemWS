package com.medikm.dto;

/**
 * UserMachineInfoId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class UserMachineInfoId implements java.io.Serializable {

	// Fields

	private User user;
	private String ipAddress;

	// Constructors

	/** default constructor */
	public UserMachineInfoId() {
	}

	/** full constructor */
	public UserMachineInfoId(User user, String ipAddress) {
		this.user = user;
		this.ipAddress = ipAddress;
	}

	// Property accessors

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserMachineInfoId))
			return false;
		UserMachineInfoId castOther = (UserMachineInfoId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getIpAddress() == castOther.getIpAddress()) || (this.getIpAddress() != null
						&& castOther.getIpAddress() != null && this.getIpAddress().equals(castOther.getIpAddress())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getIpAddress() == null ? 0 : this.getIpAddress().hashCode());
		return result;
	}

}