package com.dwanford.spring5recipeapp.converters;

import com.dwanford.spring5recipeapp.commands.CategoryCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoryCommandToCategoryTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "description";
    CategoryCommandToCategory converter;

    @BeforeEach
    void setUp() throws Exception{
        converter = new CategoryCommandToCategory();
    }

    @Test
    void convert() throws Exception {
        //given
        CategoryCommand categoryCommand = new CategoryCommand();
    }
}