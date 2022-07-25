package userregister.usercore.dao.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends CrudRepository<Register, Long> {

    public Register findByPhoneNumber(String phoneNumber);
}

