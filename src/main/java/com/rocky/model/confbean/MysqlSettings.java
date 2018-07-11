/**
 * Author:   shitian
 * Date:     2018/7/11 10:03
 * Description:
 */
package com.rocky.model.confbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/11
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix = "mysql.jdbc")
@PropertySource("classpath:/datasource.properties")
public class MysqlSettings {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
