package com.ntrlab.gpb.common.api.responses;

import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gakopyan on 2015-07-06
 */
public class EmptyResponse implements IResponse {
    @Getter
    protected List<String> messages = new ArrayList<String>();
    @Getter
    protected JSONObject jsonObject = new JSONObject();

    @Getter
    @Setter
    protected Response.Status status = Response.Status.OK;

    public EmptyResponse() {}

    public EmptyResponse(Response.Status status) {
        this.status = status;
    }

    public String getJSONString() {
        if (!messages.isEmpty()) {
            JSONArray jsonArray = new JSONArray();
            for (String message : messages) {
                jsonArray.add(message);
            }
            jsonObject.put("messages", jsonArray);
        }
        return jsonObject.toJSONString();
    }

    public Response.Status getHttpResponseStatus() {
        return status;
    }
}
