package sn.groupeisi.regulationimpot.entities;

import jakarta.persistence.*;
import lombok.*;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Declaration implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateDeclaration;
    private double montantDeclaration;
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_declarant")
    private Declarant declarant;

    @OneToMany(mappedBy = "declaration", cascade = CascadeType.ALL)
    private List<Paiement> paiements;
}
