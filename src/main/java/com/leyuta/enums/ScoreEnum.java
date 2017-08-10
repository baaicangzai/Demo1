package com.leyuta.enums;

/**
 * 枚举类测试：考试分数例子
 *
 * @author listen
 * @date 2017/08/10 10:32
 */
public enum ScoreEnum
{

    NORMAL(60, "一般般，刚及格。"), NIUB(100, "牛B，满分！");

    /**
     * 分数
     */
    private Integer score;

    /**
     * 分数说明
     */
    private String info;

    ScoreEnum(Integer score, String info)
    {
        this.score = score;
        this.info = info;
    }
}
