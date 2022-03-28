package ru.netology.i18n;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalizationServiceImplTest {

    @BeforeEach
    void setUp() {
        System.out.println("BeforeAll");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeEach");
    }

    @Test
    void test_locale() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String country = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        assertEquals(expected, country);


    }

}
