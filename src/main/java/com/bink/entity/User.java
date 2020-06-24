package com.bink.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 实体类对应表
 *
 * @author Bink
 * @date 2020/6/23
 */
@Component
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;
}
