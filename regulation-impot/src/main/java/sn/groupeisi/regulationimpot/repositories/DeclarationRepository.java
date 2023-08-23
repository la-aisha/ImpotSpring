package sn.groupeisi.regulationimpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.regulationimpot.entities.Declaration;

public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
}
