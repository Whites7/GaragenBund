package com.example.garagenbund;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class IndexController {

    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/public";



    @GetMapping("/")
    public String index() {
        return "index";
    }


    @PostMapping("/uploads")
    public String uploadImage(Model model, @RequestParam("image") MultipartFile file) throws IOException {
        //StringBuilder fileNames = new StringBuilder();
        //Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
        //fileNames.append(file.getOriginalFilename());
        //Files.write(fileNameAndPath, file.getBytes());
        //model.addAttribute("msg", "Uploaded images: " + fileNames.toString());

        FileUploadUtil.saveFile(UPLOAD_DIRECTORY, file.getOriginalFilename(), file);

        return "index";
    }





}