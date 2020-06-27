package com.example.javatest;

import com.example.javatest.UtilFunctions.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ListsTests {

    @Test()
    void partitionTest() throws Exception {
        List<Integer> liste1 = Arrays.asList(1, 8, 9, 12, 3, 10);
        List<Integer> liste2 = Arrays.asList(12, 81, 4, 5, 31, 17, 99);
        List<Integer> liste3 = Arrays.asList(18, 93, 22, 74, 30, 21, 2, 72, 11, 57, 0);
        List<List> resultListe1_1 = Arrays.asList(Arrays.asList(1, 8), Arrays.asList(9, 12),
                Arrays.asList(3, 10));
        List<List> resultListe1_2 = Arrays.asList(Arrays.asList(1, 8, 9), Arrays.asList(12, 3, 10));
        List<List> resultListe1_3 = Arrays.asList(Arrays.asList(1, 8, 9, 12), Arrays.asList(3, 10));
        List<List> resultListe2_1 = Arrays.asList(Arrays.asList(12, 81), Arrays.asList(4, 5),
                Arrays.asList(31, 17), Arrays.asList(99));
        List<List> resultListe2_2 = Arrays.asList(Arrays.asList(12, 81, 4), Arrays.asList(5, 31, 17),
                Arrays.asList(99));
        List<List> resultListe2_3 = Arrays.asList(Arrays.asList(12, 81, 4, 5), Arrays.asList(31, 17, 99));
        List<List> resultListe3_1 = Arrays.asList(Arrays.asList(18, 93), Arrays.asList(22, 74),
                Arrays.asList(30, 21), Arrays.asList(2, 72), Arrays.asList(11, 57), Arrays.asList(0));
        List<List> resultListe3_2 = Arrays.asList(Arrays.asList(18, 93, 22), Arrays.asList(74, 30, 21),
                Arrays.asList(2, 72, 11), Arrays.asList(57, 0));
        List<List> resultListe3_3 = Arrays.asList(Arrays.asList(18, 93, 22, 74, 30), Arrays.asList(21, 2, 72, 11, 57),
                Arrays.asList(0));
        Assertions.assertEquals(Lists.partition(liste1, 2), resultListe1_1, "6 items splitted on 3 parts of 2 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste1, 3), resultListe1_2, "6 items splitted on 2 parts of 3 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste1, 4), resultListe1_3, "6 items splitted on 2 parts of 4 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste2, 2), resultListe2_1, "7 items splitted on 4 parts of 2 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste2, 3), resultListe2_2, "7 items splitted on 3 parts of 3 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste2, 4), resultListe2_3, "7 items splitted on 2 parts of 4 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste3, 2), resultListe3_1, "11 items splitted on 6 parts of 2 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste3, 3), resultListe3_2, "11 items splitted on 4 parts of 3 elements tests FAILED");
        Assertions.assertEquals(Lists.partition(liste3, 5), resultListe3_3, "11 items splitted on 3 parts of 5 elements tests FAILED");

    }

}
