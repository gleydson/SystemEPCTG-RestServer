package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.estacaoluz.epctg.bean.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> { }
