package userletters.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import userletters.dao.entity.Letter;

@Repository
public interface LetterRepository extends CrudRepository<Letter, Long> {

//    Letter findByPhoneNumber(String phoneNumber);

}
