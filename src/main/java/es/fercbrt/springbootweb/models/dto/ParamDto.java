package es.fercbrt.springbootweb.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ParamDto {
    private String message;
    private Integer code;
}
