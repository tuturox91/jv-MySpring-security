package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @NotNull
    @NotBlank(message = " field can't be empty")
    @Email
    private String email;
    @NotNull
    @Size(min = 7)
    @NotBlank(message = " field can't be empty")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
