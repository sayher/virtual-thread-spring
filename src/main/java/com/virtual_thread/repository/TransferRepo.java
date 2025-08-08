package com.virtual_thread.repository;

import com.virtual_thread.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface TransferRepo extends JpaRepository<Transfer, BigInteger> {

  @Query(value = "SELECT * FROM TBL_MB_TRANSFER t WHERE t.title = ?1",nativeQuery =  true)
   List<Transfer> findByTitle(String title);
}
