package com.rocky;

import com.rocky.utils.AnalyzePomDependency;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: UtilsTest
 * @Description:
 * @Author: shitian
 * @CreateDate: 2019/7/17 11:18
 */
public class UtilsTest {

    @Test
    public void testAnalyzePom()throws Exception{
        Model model = AnalyzePomDependency.analyzePom("pom.xml");
        List<Dependency> dependencyList = model.getDependencies();
        System.out.println(dependencyList.size());
    }
}
