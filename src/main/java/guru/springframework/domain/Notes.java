package guru.springframework.domain;

import javax.persistence.*;

import lombok.*;;

@EqualsAndHashCode(exclude = {"recipe"})
@Getter
@Setter
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
