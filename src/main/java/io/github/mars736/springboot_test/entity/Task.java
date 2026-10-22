package io.github.mars736.springboot_test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Integer completedScore;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

}
