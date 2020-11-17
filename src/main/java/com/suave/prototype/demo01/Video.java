package com.suave.prototype.demo01;

import lombok.*;

import java.util.Date;

/**
 * 实现克隆接口
 * 重写克隆方法
 * * @Data注解会重写hashCode方法，导致克隆后的对象hashCode值相同，因此不能用@Data
 * @author Suave
 * @date 2020/11/17 16:05
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Video implements Cloneable {
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
