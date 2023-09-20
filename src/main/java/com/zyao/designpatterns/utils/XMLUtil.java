package com.zyao.designpatterns.utils;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 14:46
 * @Description
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document parse = documentBuilder.parse(new File("src\\main\\resources\\config.xml"));
            NodeList nl = parse.getElementsByTagName("className");
            String nodeName = nl.item(0).getFirstChild().getNodeValue();
            Class<?> aClass = Class.forName(nodeName);
            return aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
