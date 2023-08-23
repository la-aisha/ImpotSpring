package sn.groupeisi.regulationimpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.regulationimpot.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
