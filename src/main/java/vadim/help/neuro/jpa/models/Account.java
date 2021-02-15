package vadim.help.neuro.jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id private Long id;

    private String email;
    private String passwd;
    //String email;
   // String access_level;

    //@Column(unique=true) String email;


}
