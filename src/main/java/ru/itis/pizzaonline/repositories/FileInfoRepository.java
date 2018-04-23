package ru.itis.pizzaonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.pizzaonline.models.FileInfo;

import java.util.Optional;

/**
 * Date 22.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
@Repository
public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {
    Optional<FileInfo> findFirstByFileName(String fileName);
}
