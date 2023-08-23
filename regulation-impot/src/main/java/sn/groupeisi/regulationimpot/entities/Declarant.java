package sn.groupeisi.regulationimpot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Declarant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String raisonSociale;
    private String adresse;
    private String email;
    private String telephone;
    @OneToMany(mappedBy = "declarant", cascade = CascadeType.ALL)
    private List<Declaration> declarations = new ArrayList<>();
    @OneToMany(mappedBy = "declarant", cascade = CascadeType.ALL)
    private List<Paiement> paiements = new ArrayList<>();
}
