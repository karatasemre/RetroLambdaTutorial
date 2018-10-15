package emre.com.retrolambdatutorial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Emre.Karatas on 12.10.2018.
 */
//Lombok expressions
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private String surname;

}
