package com.example.demo.paket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaketRepository extends JpaRepository<Paket,Long> {

}
