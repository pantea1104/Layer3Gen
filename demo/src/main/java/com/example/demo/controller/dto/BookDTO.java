package com.example.demo.controller.dto;

import lombok.Data;

/**
* Generated by Springboot-3layer-Generator at Feb 26, 2023, 4:08:34 PM
*/
@Data
public class BookDTO {

    private long serialVersionUID;
    private java.lang.Integer bookId;
    private java.lang.String author;
    private java.lang.String isbn;
    private java.lang.String title;
    private java.lang.Integer year;
    private java.util.List orders;

}
