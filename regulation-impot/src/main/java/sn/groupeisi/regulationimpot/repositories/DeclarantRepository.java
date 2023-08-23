package sn.groupeisi.regulationimpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.regulationimpot.entities.Declarant;

public interface DeclarantRepository extends JpaRepository<Declarant, Long> {
}
