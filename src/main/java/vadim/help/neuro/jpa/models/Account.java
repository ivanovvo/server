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
    @Column(nullable = false)
    @Id private Integer id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;


    //String email;
   // String access_level;

    //@Column(unique=true) String email;


}
