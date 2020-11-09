package com.org.man.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "man")
public class Man {
    @Id
    private int manId;
    private String manName;
    private int manAge;
    private String manAddress;
    private String manInterest;
    private String manGender;
    private int manHeight;
    private float manWeight;
    private int manNumber;
}
