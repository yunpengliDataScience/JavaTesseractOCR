package org.dragon.yunpeng;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import java.io.File;

public class OCRExample {
    public static void main(String[] args) {
        // Path to the Tesseract installation directory (e.g., "C:\\Program Files\\Tesseract-OCR")
        String tesseractPath = "C:\\Program Files\\Tesseract-OCR";

        // Set Tesseract data path
        System.setProperty("jna.library.path", tesseractPath);
        //System.setProperty("TESSDATA_PREFIX", "C:\\Program Files\\Tesseract-OCR\\tessdata");

        // Create an instance of Tesseract OCR engine
        ITesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");

        try {
            // Set language for OCR (optional)
            tesseract.setLanguage("eng");

            // Perform OCR on an image file
            File imageFile = new File("C:\\Projects\\PDF2XML\\files\\example.JPG");
            String result = tesseract.doOCR(imageFile);
            System.out.println("OCR Result:");
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Error performing OCR: " + e.getMessage());
        }
    }
}
