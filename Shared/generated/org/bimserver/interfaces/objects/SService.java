package org.bimserver.interfaces.objects;

/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/
import javax.xml.bind.annotation.XmlTransient;
import org.bimserver.shared.meta.*;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SService implements SDataBase
{
	private long oid = -1;

	@XmlTransient
	private static SClass sClass;
	
	public long getOid() {
		return oid;
	}
	
	public void setOid(long oid) {
		this.oid = oid;
	}
	
	@XmlTransient
	public SClass getSClass() {
		return sClass;
	}
	
	public static void setSClass(SClass sClass) {
		SService.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("name")) {
			return getName();
		}
		if (sField.getName().equals("url")) {
			return getUrl();
		}
		if (sField.getName().equals("token")) {
			return getToken();
		}
		if (sField.getName().equals("notificationProtocol")) {
			return getNotificationProtocol();
		}
		if (sField.getName().equals("description")) {
			return getDescription();
		}
		if (sField.getName().equals("trigger")) {
			return getTrigger();
		}
		if (sField.getName().equals("readRevisionId")) {
			return getReadRevisionId();
		}
		if (sField.getName().equals("readExtendedDataId")) {
			return getReadExtendedDataId();
		}
		if (sField.getName().equals("writeRevisionId")) {
			return getWriteRevisionId();
		}
		if (sField.getName().equals("writeExtendedDataId")) {
			return getWriteExtendedDataId();
		}
		if (sField.getName().equals("projectId")) {
			return getProjectId();
		}
		if (sField.getName().equals("userId")) {
			return getUserId();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("name")) {
			setName((String)val);
			return;
		}
		if (sField.getName().equals("url")) {
			setUrl((String)val);
			return;
		}
		if (sField.getName().equals("token")) {
			setToken((String)val);
			return;
		}
		if (sField.getName().equals("notificationProtocol")) {
			setNotificationProtocol((SAccessMethod)val);
			return;
		}
		if (sField.getName().equals("description")) {
			setDescription((String)val);
			return;
		}
		if (sField.getName().equals("trigger")) {
			setTrigger((STrigger)val);
			return;
		}
		if (sField.getName().equals("readRevisionId")) {
			setReadRevisionId((Long)val);
			return;
		}
		if (sField.getName().equals("readExtendedDataId")) {
			setReadExtendedDataId((Long)val);
			return;
		}
		if (sField.getName().equals("writeRevisionId")) {
			setWriteRevisionId((Long)val);
			return;
		}
		if (sField.getName().equals("writeExtendedDataId")) {
			setWriteExtendedDataId((Long)val);
			return;
		}
		if (sField.getName().equals("projectId")) {
			setProjectId((Long)val);
			return;
		}
		if (sField.getName().equals("userId")) {
			setUserId((Long)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.lang.String name;
	private java.lang.String url;
	private java.lang.String token;
	private SAccessMethod notificationProtocol;
	private java.lang.String description;
	private STrigger trigger;
	private long readRevisionId;
	private long readExtendedDataId;
	private long writeRevisionId;
	private long writeExtendedDataId;
	private long projectId;
	private long userId;
	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
	public java.lang.String getUrl() {
		return url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}
	public java.lang.String getToken() {
		return token;
	}

	public void setToken(java.lang.String token) {
		this.token = token;
	}
	public SAccessMethod getNotificationProtocol() {
		return notificationProtocol;
	}

	public void setNotificationProtocol(SAccessMethod notificationProtocol) {
		this.notificationProtocol = notificationProtocol;
	}
	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	public STrigger getTrigger() {
		return trigger;
	}

	public void setTrigger(STrigger trigger) {
		this.trigger = trigger;
	}
	public long getReadRevisionId() {
		return readRevisionId;
	}

	public void setReadRevisionId(long readRevisionId) {
		this.readRevisionId = readRevisionId;
	}
	
	public long getReadExtendedDataId() {
		return readExtendedDataId;
	}

	public void setReadExtendedDataId(long readExtendedDataId) {
		this.readExtendedDataId = readExtendedDataId;
	}
	
	public long getWriteRevisionId() {
		return writeRevisionId;
	}

	public void setWriteRevisionId(long writeRevisionId) {
		this.writeRevisionId = writeRevisionId;
	}
	
	public long getWriteExtendedDataId() {
		return writeExtendedDataId;
	}

	public void setWriteExtendedDataId(long writeExtendedDataId) {
		this.writeExtendedDataId = writeExtendedDataId;
	}
	
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (oid ^ (oid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SService other = (SService) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}