package com.bplsoft.common.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@MappedSuperclass
public abstract class BaseModel<T> implements Model<T> {

    private static final long serialVersionUID = -5078006836869173887L;

    @Version
    @Column(name = "BM_VERSION", nullable = false)
    private Long version = 0L;

    @Column(name = "BM_IS_DELETED")
    private boolean deleted = false;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
