package spring.web.app.springwepapp.BootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.web.app.springwepapp.Respositories.AuthorRepository;
import spring.web.app.springwepapp.Respositories.BookRepository;
import spring.web.app.springwepapp.Respositories.PublisherRepository;
import spring.web.app.springwepapp.domain.Author;
import spring.web.app.springwepapp.domain.Book;
import spring.web.app.springwepapp.domain.Publisher;

@Component
class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRespority;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository
            publisherRespority) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRespority = publisherRespority;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in BootStrap:");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("SF");

        publisherRespority.save(publisher);

        System.out.println("Publisher Count: " + publisherRespority.count());

        Author eric = new Author("Eric","Evans");
         Book book = new Book("Domain Divan Design","12345646789");
        eric.getBooks().add(book);
        book.getAuthor().add(eric);

         book.setPublisher(publisher);
        publisher.getBooks().add(book);

         authorRepository.save(eric);
         bookRepository.save(book);
        publisherRespority.save(publisher);

         Author rod = new Author("Rod","JhonSon");
         Book noEJB = new Book("J2EE development without EJB","3939453459");
         rod.getBooks().add(noEJB);
         noEJB.getAuthor().add(rod);

        noEJB.setPublisher(publisher);
         publisher.getBooks().add(noEJB);

         authorRepository.save(rod);
         bookRepository.save(noEJB);
        publisherRespority.save(publisher);

        System.out.println("Number of Books: " + bookRepository.count());
         System.out.println("Publisher Number of Books: " + publisher.getBooks().size());

    }
}