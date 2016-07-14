package com.ntrlab.gpb.common.api.responses;

import com.ntrlab.gpb.common.api.IResponseObject;
import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONArray;

import java.util.List;

/**
 * Created by Aleksandr on 29.07.2015.
 */
public class GetEntityListResponse<T extends IResponseObject> extends EmptyResponse {
    @Getter @Setter private List<T> entities;
    private JSONArray jsonArray = new JSONArray();

    public GetEntityListResponse(List<T> entities) {
        this.entities = entities;
        for(T entity : entities) {
            jsonArray.add(entity.getJson());
        }
    }

    @Override
    public String getJSONString() {
        return jsonArray.toJSONString();
    }
}
