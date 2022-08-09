package com.cool.movie.utils;

import com.cool.movie.exception.NotAvailablePositionException;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public class GenerateSeatingUtils {

    private static final Integer MAX_CAPACITY_OF_ROW = 10;

    public static List<String> generateSeating(Integer capacity, Integer availablePosition) {
        if (capacity == null || capacity <= 0 || availablePosition == null || availablePosition <= 0) {
            throw new NotAvailablePositionException();
        }
        int row = (capacity - availablePosition) / MAX_CAPACITY_OF_ROW + 1;
        int column = (capacity - availablePosition) % MAX_CAPACITY_OF_ROW + 1;
        return Arrays.asList(MessageFormat.format("{0}-{1}", row, column), MessageFormat.format("{0}-{1}", row, (column + 1)));
    }

}
