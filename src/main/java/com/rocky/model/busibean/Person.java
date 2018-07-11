/**
 * Author:   shitian
 * Date:     2018/7/11 11:08
 * Description:
 */
package com.rocky.model.busibean;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/11
 * @since 1.0.0
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}