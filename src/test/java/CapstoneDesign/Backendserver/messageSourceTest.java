package CapstoneDesign.Backendserver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class messageSourceTest {

    @Autowired
    MessageSource messageSource;

//    @Test
//    void helloMessage(){
//        String result = messageSource.getMessage("hello", null, null);
//        assertThat(result).isEqualTo("안녕");
//    }
}
