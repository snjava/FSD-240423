package com.institute.repsotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.institute.entity.Address;

@Repository
public interface AddressRepo  extends JpaRepository<Address, Integer>{

}
