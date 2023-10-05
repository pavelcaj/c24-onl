package lesson18;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 для парсинга с SAX, 2 для парсинга с DOM:");
        int choice = scanner.nextInt();

        try {
            if (choice == 1) {
                parseWithSAX();
            } else if (choice == 2) {
                parseWithDOM();
            } else {
                System.out.println("Неверный выбор.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
    private static void parseWithSAX() throws IOException, SAXException {
        String xmlFilePath = "D:\\c24-onl\\src\\lesson18\\hw1.xml";
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        MyHandler handler = new MyHandler();

        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            saxParser.parse(new File(xmlFilePath), handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    private static void parseWithDOM() throws IOException, SAXException, ParserConfigurationException {
        String xmlFilePath = "D:\\c24-onl\\src\\lesson18\\hw1.xml";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(xmlFilePath));

        List<String> lines = new ArrayList<>();
        NodeList lineNodes = document.getElementsByTagName("line");
        for (int i = 0; i < lineNodes.getLength(); i++) {
            Node lineNode = lineNodes.item(i);
            if (lineNode.getNodeType() == Node.ELEMENT_NODE) {
                lines.add(lineNode.getTextContent());
            }
        }

        writeLinesToFile(lines);
    }

    private static void writeLinesToFile(List<String> lines) throws IOException {
        String firstName = "William";
        String lastName = "Shakespeare";
        String title = "Sonnet_130";

        String fileName = String.format("%s_%s_%s.txt", firstName, lastName, title);
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (String line : lines) {
                writer.println(line);
            }
        }

        System.out.println("Содержимое тегов <line> было записано в файл " + fileName);
    }

    private static class MyHandler extends DefaultHandler {
        private List<String> lines = new ArrayList<>();
        private boolean inLine = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            if (qName.equals("line")) {
                inLine = true;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (qName.equals("line")) {
                inLine = false;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            if (inLine) {
                String line = new String(ch, start, length).trim();
                if (!line.isEmpty()) {
                    lines.add(line);
                }
            }
        }

        @Override
        public void endDocument() throws SAXException {
            try {
                writeLinesToFile(lines);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


