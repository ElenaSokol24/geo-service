package ru.netology.geo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.geo.GeoServiceImpl.LOCALHOST;

public class GeoServiceImplTest {

    @BeforeEach
    void setUp() {
        System.out.println("BeforeAll");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeEach");
    }


    @Test
    void test_byIp() {
        GeoService geoService = new GeoServiceImpl();
        Location current = geoService.byIp(LOCALHOST);
        Location expected = new Location(null, null, null, 0);
        assertEquals(expected, current);

    }


}