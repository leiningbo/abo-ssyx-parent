package com.abo.ssyx.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    //图片上传的方法
    String uploadFile(MultipartFile file);
}
