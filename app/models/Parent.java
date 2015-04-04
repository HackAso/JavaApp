package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Aki on 15/04/02.
 */

@Entity
public class Parent extends Model {

    @Id
    public Long id;

    @NotNull
    public String name;

    @CreatedTimestamp
    public Date createDate;

    @Version
    public Date updateDate;

    public String toString() {
        return "Parent [id=" + id + ", name=" + name + ", createDate="
                + createDate + ", updateDate=" + updateDate + "]";
    }
}


