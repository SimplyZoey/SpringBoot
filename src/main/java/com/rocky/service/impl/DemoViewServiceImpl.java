/**
 * Author:   shitian
 * Date:     2018/7/11 11:39
 * Description:
 */
package com.rocky.service.impl;

import com.rocky.model.busibean.Person;
import com.rocky.service.DemoViewService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/11
 * @since 1.0.0
 */
@Service
public class DemoViewServiceImpl implements DemoViewService {

    @Override
    public List<Person> getPersonList() {
        List<Person> list = new ArrayList<>();
        Person temp;
        for (int i = 1; i <= 5; i++) {
            temp = new Person("test" + i, i * 10);
            list.add(temp);
        }
        return list;
    }
}
