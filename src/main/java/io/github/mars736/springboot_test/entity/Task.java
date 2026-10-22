package io.github.mars736.springboot_test.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Task {
    private Integer id;
    private Integer projectId;
    private String title;
    private String description;
    private LocalDateTime deadline;
    private Integer totalScore;
    private Integer status; // 0: 未开始, 1: 进行中, 2: 已完成
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}
