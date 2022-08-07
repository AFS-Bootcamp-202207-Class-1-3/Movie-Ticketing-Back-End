
package com.cool.movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


@Controller
@SpringBootApplication
public class MovieApplication {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(MovieApplication.class, args);
  }
}
