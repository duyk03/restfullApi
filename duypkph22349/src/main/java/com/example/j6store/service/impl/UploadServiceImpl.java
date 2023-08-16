package com.example.j6store.service.impl;

import com.example.j6store.service.Uploadservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Service
public class UploadServiceImpl implements Uploadservice {
    @Autowired
    ServletContext svt;
    @Override
    public File save(MultipartFile file, String folder) {
        File tt = new File(svt.getRealPath("/assets/"+folder));
        if (!tt.exists()){
            tt.mkdir();
        }
        String s= System.currentTimeMillis()+ file.getOriginalFilename();
        String name = Integer.toHexString(s.hashCode())
                    + s.substring(s.lastIndexOf("."));
        try {
            File savedFile = new File(tt,name);
            file.transferTo(savedFile);
            System.out.println(savedFile.getAbsolutePath());
            return savedFile;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
