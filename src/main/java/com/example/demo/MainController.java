package com.example.demo;

import io.vavr.collection.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/whatever")
  public List<String> getStrings() {
    return List.of("abc", "def", "ghi");
  }

}
