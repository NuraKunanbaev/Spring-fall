package com.example.springcourse.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record Value(Long id, String quote)  {
}
