package com.grn.projectlombok.repositories;

import com.grn.projectlombok.entities.Beer;
import com.grn.projectlombok.model.BeerStyle;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;
    @Test
    void testSaveBeerNameTooLong(){
        assertThrows(ConstraintViolationException.class, () -> {
            Beer savedBeer = beerRepository.save(Beer.builder()
                    .beerName("My beer 123213213213123213123213213213123213123213213213123213123213213213123213123213213213123213123213213213123213123213213213123213123213213213123213123213213213123213123213213213123213").beerStyle(BeerStyle.IPA).upc("232324242").price(new BigDecimal("11.99"))
                    .build());
            beerRepository.flush();
        });
    }
    @Test
    void testSaveBeer(){
        Beer savedBeer = beerRepository.save(Beer.builder()
                .beerName("My beer").beerStyle(BeerStyle.IPA).upc("232324242").price(new BigDecimal("11.99"))
                .build());
        beerRepository.flush();
        assertThat(savedBeer).isNotNull();
        assertThat(savedBeer.getId()).isNotNull();
    }
}