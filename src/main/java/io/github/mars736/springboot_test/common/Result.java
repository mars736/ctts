package io.github.mars736.springboot_test.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result <T> {
    private int code;
    private String message;
    private T data;

    public static<T> Result<T> success(T data) {
        return new Result<>(200, "Success", data);
    }

    public static<T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }
}
