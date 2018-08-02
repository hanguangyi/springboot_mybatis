package cn.no7player.model;

import lombok.Data;

/**
 * Created by zl on 2015/8/27.
 */
@Data
public class User {
    private Long id;
    private String pids;
    private Integer type;
    private Long beginTime;
    private Long endTime;
    private String name;
    private Integer status;
    private String config;
    private String userGroup;
}
