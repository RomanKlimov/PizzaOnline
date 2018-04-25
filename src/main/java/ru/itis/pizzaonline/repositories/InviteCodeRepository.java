package ru.itis.pizzaonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.pizzaonline.models.InviteCode;

@Repository
public interface InviteCodeRepository extends JpaRepository<InviteCode, Long> {
}
