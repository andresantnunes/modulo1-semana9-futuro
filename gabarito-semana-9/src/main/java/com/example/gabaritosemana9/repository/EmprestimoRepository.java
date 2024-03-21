package com.example.gabaritosemana9.repository;

import com.example.gabaritosemana9.entity.EmprestimosEntity;
import com.example.gabaritosemana9.entity.LivroEntity;
import com.example.gabaritosemana9.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

public interface EmprestimoRepository extends JpaRepository<EmprestimosEntity, Long> {

    @Query(
            name = "Update EmprestimosEntity e " +
                    " SET" +
                    " e.livro = :livro ," +
                    " e.membro = :membro ," +
                    " e.data_emprestimo = :data_emprestimo ," +
                    " e.data_devolucao = :data_devolucao " +
                    " where e.id = :id "
    )
    EmprestimosEntity update(@Param("id") Long id,
                                   @Param("livro") LivroEntity livro,
                                   @Param("membro") MembroEntity membro,
                                   @Param("data_emprestimo") LocalDate dataEmprestimo,
                                   @Param("data_devolucao") LocalDate dataDevolucao);
}
