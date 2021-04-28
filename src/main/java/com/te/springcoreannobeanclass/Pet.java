package com.te.springcoreannobeanclass;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.springcoreannota.example.Animal;

import lombok.Data;

@Data
public class Pet {
private String pname;
@Autowired
private Animal animal;
}
