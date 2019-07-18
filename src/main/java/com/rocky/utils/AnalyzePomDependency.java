package com.rocky.utils;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName: AnalyzePomDependency
 * @Description:
 * @Author: shitian
 * @CreateDate: 2019/7/17 11:15
 */
public class AnalyzePomDependency {

    public static Model analyzePom(String pomFile) throws Exception {
        FileInputStream fis = new FileInputStream(new File(pomFile));
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model = reader.read(fis);
        return model;
    }

}
