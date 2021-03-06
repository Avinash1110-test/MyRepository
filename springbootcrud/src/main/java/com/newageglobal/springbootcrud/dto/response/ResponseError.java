package com.newageglobal.springbootcrud.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResponseError {

    private String code;
    private List<String> message;

}
