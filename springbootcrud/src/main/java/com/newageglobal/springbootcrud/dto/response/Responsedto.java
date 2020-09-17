package com.newageglobal.springbootcrud.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Responsedto {
    private boolean success;
    private Integer httpStatus;

    private Object result;

    public Responsedto(Integer httpStatus, boolean success, Object result) {
        this.httpStatus = httpStatus;
        this.success = success;
        this.result = result;
    }
}
