package spring.web.app.springwepapp.Respositories;

import org.springframework.data.repository.CrudRepository;
import spring.web.app.springwepapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
