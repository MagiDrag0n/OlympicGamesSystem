package com.magidragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class gameinfo {
    private String gameID;
    private String gameName;
    private String gameTime;
    private String isFinal;
}
