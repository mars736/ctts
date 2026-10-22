package io.github.mars736.springboot_test.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TrainingProject {
    private Integer id;
    private String title;
    private String description;
    private Integer teacherId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
