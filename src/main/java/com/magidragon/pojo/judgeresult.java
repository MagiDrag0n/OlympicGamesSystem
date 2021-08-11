package com.magidragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class judgeresult {
    private int gameID;
    private int playerID;
    private String result;
    private int judgeID;
    private String judge_comment;
}
