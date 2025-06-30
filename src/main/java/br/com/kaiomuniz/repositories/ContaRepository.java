package br.com.kaiomuniz.repositories;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.kaiomuniz.domain.entities.Conta;

@Repository
public interface ContaRepository extends MongoRepository<Conta, UUID> {


}
