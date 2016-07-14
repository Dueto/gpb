package com.ntrlab.gpb.common;

import com.ntrlab.gpb.common.api.IResponseObject;
import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by PRIMA on 14.07.2016.
 */
@Entity
@Table(name = "DEMO_CUSTOMERS", schema = "GPB")
public class Customer implements IResponseObject {
    @Id
    @Column(name = "CUSTOMER_ID")
    @Getter @Setter private Integer customerId;

    @Column(name = "CUST_FIRST_NAME")
    @Getter @Setter private String firstName;

    @Column(name = "CUST_LAST_NAME")
    @Getter @Setter private String lastName;

    public JSONObject getJson() {
        JSONObject json = new JSONObject();
        json.put("id", customerId);
        json.put("name", firstName);
        json.put("lastName", lastName);
        return json;
    }
}