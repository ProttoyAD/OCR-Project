package com.example.ocr.ocr.controller;

import com.example.ocr.ocr.service.TesseractOCRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class OcrController {

    @Autowired
    private TesseractOCRService tesseractOCRService;


    @GetMapping("/home")
    public String Home() {
        return "home";
    }

    @PostMapping("/ocr")
    public String recognizeText(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        String result = tesseractOCRService.recognizeText(file.getInputStream());
        model.addAttribute("result", result);
        return "result";
    }


}


