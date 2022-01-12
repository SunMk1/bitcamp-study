package com.eomcs.mylist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  //  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext beanContainer) {
    return args -> {

      System.out.println("빈 컨테이너가 생성한 객체(빈 컨테이너에 들어 있는 객체)");

      String[] beanNames = beanContainer.getBeanDefinitionNames();
      for (int i = 0; i < beanNames.length; i++) {
        Object bean = beanContainer.getBean(beanNames[i]);
        System.out.printf("----> %03d: %s\n", i+1, bean.getClass().getName());
      }

    };
  }

  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format("Hello %s!", name);
  }
}