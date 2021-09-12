package com.magidragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class community {
    private int id;
    private int replyTo;

//  隐式参数 name,replierName;

    private String name;
    private String replierName;

//  -------------------------

    private String comment;
    private String commentTime;
    private int thumbs;
}
