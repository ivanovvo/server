package vadim.help.neuro.jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoOfArea {
    @Id private Long id;
    @GeneratedValue(strategy = GenerationType.AUTO)

    //private Long animal_id;
    private String name;
    private Byte photo;

}
