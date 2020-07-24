package br.senai.sp.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.senai.sp.backend.model.Fotografo;
import br.senai.sp.backend.model.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
	 
	@Query(value = "select * from tbl_portfolio p where p.id =?1", nativeQuery = true)
	Portfolio portfoliosFotografo(@Param("id") Long id_fotografo);
	
	@Query(value = "select * from tbl_portfolio p where p.id =?1", nativeQuery = true)
	List<Portfolio> portfolioPorId(@Param("id") Long id_fotografo);
}
