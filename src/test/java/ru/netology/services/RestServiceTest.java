package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvSource({
            "2, 100000, 60000,150000",
            "3, 10000, 3000, 20000"
    })
    void shouldCalculateNumberOfMonthsOfRest(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


}
