package br.com.daianebellon.forum.repository;

import br.com.daianebellon.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCurso_Nome(String nomeCurso);

    /*@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    List<Topico> buscaListaTopicosPeloNomeDoCurso(@Param("nomeCurso") String nomeCurso);*/
}
