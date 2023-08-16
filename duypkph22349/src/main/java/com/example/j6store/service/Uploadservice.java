package com.example.j6store.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface Uploadservice {
    File save(MultipartFile file, String folder);
}
