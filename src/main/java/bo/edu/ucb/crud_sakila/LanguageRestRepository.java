package bo.edu.ucb.crud_sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "languages", path = "languages")
public interface LanguageRestRepository extends PagingAndSortingRepository<Language, Integer>{

    List<Language> findByLanguage(@Param("name") String name);

   
}
