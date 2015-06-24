/*
 * Copyright 2015 YANG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.uci.ics.crawler4j.examples.imagecrawler;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.regex.Pattern;

import com.google.common.io.Files;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.BinaryParseData;
import edu.uci.ics.crawler4j.url.WebURL;
/**
 *
 * @author YANG
 */
public class Test {

    //    System.out.println("year: "+year +"\nmonth:"+month+"\nimagename:"+imagename);
    public static void main(String[] args) throws Exception {
        String url = " http://64alexander.com.au/wp-content/uploads/ladies/Lily/2891841_orig.jpg";
        String temp = url;
        // get a unique name for storing this image
        // String year = temp.substring(temp.lastIndexOf('/', 3), temp.lastIndexOf('/', 2));
        // String month = temp.substring(temp.lastIndexOf('/', 2), temp.lastIndexOf('/', 1));
        // String imagename = temp.substring(temp.lastIndexOf('/') + 1);
        String[] splited = temp.split("/");
        int i = splited.length;
        String iname = splited[--i];
        String folder1 = splited[--i];
        String folder2 = splited[--i];

        System.out.println(iname);
        System.out.println(folder1);
        System.out.println(folder2);

        if(!new File("D:\\images_try\\img/2013/12").exists()){
        new File("D:\\images_try\\img/2013/12").mkdirs();
        } 
    }
}
