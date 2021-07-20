package com.magidragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class gamedays {
    private int gameID;
    private Date gameTime;
    private int player;
}
