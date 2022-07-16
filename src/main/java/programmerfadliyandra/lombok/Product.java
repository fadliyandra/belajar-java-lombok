package programmerfadliyandra.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.concurrent.Executors;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {
        "price"
})
public class Product {
    private final String id;

    private String name;

    private Long price;

}
