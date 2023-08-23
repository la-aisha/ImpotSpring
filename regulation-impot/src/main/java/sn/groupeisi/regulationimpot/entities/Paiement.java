package sn.groupeisi.regulationimpot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date datePaiement;

    private double montantPaiement;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_declaration")
    private Declaration declaration;

   // @OneToMany(mappedBy = "declarant", cascade = CascadeType.ALL)
   // private List<Declaration> declarations = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private Declarant declarant;
}
