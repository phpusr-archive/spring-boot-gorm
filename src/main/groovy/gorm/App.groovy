package gorm

import gorm.domain.Post
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.transaction.annotation.Transactional

/**
 * @author Doronin Sergey
 * Date: 22.04.2016
 * Time: PM 6:07
 */

@SpringBootApplication
@Transactional
class App implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new Post(title: 'Hello', text: 'Hello everybody!').save(flush: true)
    }
}