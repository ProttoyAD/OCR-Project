package com.example.ocr.ocr.config;


import net.sourceforge.tess4j.Tesseract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TesseractConfig {
    @Bean
    public Tesseract getTesseract() {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/usr/share/tesseract-ocr/4.00/tessdata");
        return tesseract;
    }



}
