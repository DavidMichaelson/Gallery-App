package training.springboot.repository;

import training.springboot.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> { //JpaRepo is used for managing data

}
