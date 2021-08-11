package com.magidragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class gameresults {
    private int gameID;
    private String gameName;
    private String gameTime;
    private int gold;
    private int silver;
    private int bronze;
}
