package com.myfirstspringboot.demo.controller;

import com.myfirstspringboot.demo.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {
        String originalFileName = file.getOriginalFilename();
        String filename = UUID.randomUUID().toString()+originalFileName.substring(originalFileName.lastIndexOf("."));
        file.transferTo(new File("D:\\.vscode\\myVueSpringboot-First\\web-springboot\\src\\main\\java\\com\\myfirstspringboot\\demo\\testFiles\\"+filename));
        return Result.success("url访问地址...");
    }
}
