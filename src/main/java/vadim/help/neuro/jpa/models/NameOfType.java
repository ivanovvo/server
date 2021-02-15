package vadim.help.neuro.jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameOfType {
    @Id private Long id;
    @GeneratedValue(strategy = GenerationType.AUTO)


   // Long animal_id;
   private String name;

}
