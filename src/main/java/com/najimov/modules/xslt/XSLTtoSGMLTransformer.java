package com.najimov.modules.xslt;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XSLTtoSGMLTransformer {
    public static void main(String[] args) {
        // Adjust these paths as needed
        String xsltPath = "src/main/resources/xslt/transformer.xsl";
        String inputXmlPath = "src/main/resources/input/input.xml";
        String outputPath = "src/main/resources/output/result.xml"; // or .xml

        try {
            // Create transformer factory and transformer
            TransformerFactory factory = TransformerFactory.newInstance();
            Source xslt = new StreamSource(new File(xsltPath));
            Transformer transformer = factory.newTransformer(xslt);

            // Set up input and output sources
            Source xmlInput = new StreamSource(new File(inputXmlPath));
            StreamResult output = new StreamResult(new File(outputPath));

            // Perform transformation
            transformer.transform(xmlInput, output);

            System.out.println("Transformation complete. Output written to: " + outputPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
