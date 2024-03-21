package com.example.gabaritosemana9.repository;

import com.example.gabaritosemana9.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Query(name = "Update MembroEntity m " +
            " Set m.nome = :nome, " +
            " m.endereco = :endereco, " +
            " m.telefone = :telefone " +
            " where m.id = :id")
    MembroEntity update(@Param("id") Long id,
                        @Param("nome") String nome,
                        @Param("endereco") String endereco,
                        @Param("telefone") String telefone);
}
