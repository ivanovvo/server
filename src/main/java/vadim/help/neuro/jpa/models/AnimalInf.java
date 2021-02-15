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
public class AnimalInf {
    @Id private Long id;
    @GeneratedValue(strategy = GenerationType.AUTO)

    //private Long name_id;
    //private Long type_id;
    //private Long area_id;
   // String name;//////////////////
    private String inf_of_type;
    private String inf_of_area;
    private String inf_of_number;
    private String inf_of_downsizing;
    private String inf_of_security;

    @OneToMany (mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<NameOfType> name_id;

    @OneToMany (mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<PhotoOfType> type_id;

    @OneToMany (mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<PhotoOfArea> area_id;


   // @OneToMany
}
