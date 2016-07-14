package com.ntrlab.gpb.common.api.responses;

import javax.ws.rs.core.Response;
import java.io.Serializable;

/**
 * Created by gakopyan on 2015-07-06
 */
public interface IResponse extends Serializable {
    String getJSONString();
    Response.Status getHttpResponseStatus();
}
