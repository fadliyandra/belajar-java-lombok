package programmerfadliyandra.lombok;

import lombok.Value;
import lombok.With;
import org.springframework.validation.annotation.Validated;

@Value
@With
public class Register {

    String username;

    String password;

}
