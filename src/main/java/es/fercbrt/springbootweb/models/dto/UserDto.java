package es.fercbrt.springbootweb.models.dto;

import es.fercbrt.springbootweb.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private String title;
    private User user;
}
