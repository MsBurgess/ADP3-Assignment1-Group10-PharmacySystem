package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MedicationRepository extends JpaRepository<Medication,String> {

    List<Medication> findAll();
    Optional<Medication> findById(String id);

}
