package spring.web.app.springwepapp.Respositories;

import org.springframework.data.repository.CrudRepository;
import spring.web.app.springwepapp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
