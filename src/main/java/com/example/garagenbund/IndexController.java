package com.example.garagenbund;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@SuppressWarnings("unused")
@Controller
public class IndexController {

    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/public";



    @GetMapping("/")
    public String index() {
        return "index";
    }


    @PostMapping("/uploads")
    public String uploadImage(Model model, @RequestParam("image") MultipartFile file) throws IOException {

        FileUploadUtil.saveFile(UPLOAD_DIRECTORY, file.getOriginalFilename(), file);

        return "index";
    }





}