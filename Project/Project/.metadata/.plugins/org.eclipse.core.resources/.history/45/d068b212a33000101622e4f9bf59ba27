package com.spareparts.util;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

public class FileUtil {
    private static final String UPLOAD_DIR = "Uploads";
    private static final String[] ALLOWED_TYPES = {"image/jpeg", "image/png", "image/gif"};

    public static String saveImage(Part filePart, String applicationPath) throws IOException {
        if (filePart == null || filePart.getSize() == 0) {
            return null;
        }
        String contentType = filePart.getContentType();
        boolean isValidType = false;
        for (String type : ALLOWED_TYPES) {
            if (type.equals(contentType)) {
                isValidType = true;
                break;
            }
        }
        if (!isValidType) {
            throw new IllegalArgumentException("Only JPEG, PNG, or GIF images are allowed");
        }
        String fileName = System.currentTimeMillis() + "_" + extractFileName(filePart);
        String uploadPath = applicationPath + File.separator + UPLOAD_DIR;
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        filePart.write(uploadPath + File.separator + fileName);
        return UPLOAD_DIR + File.separator + fileName;
    }

    private static String extractFileName(Part part) {
        String contentDisposition = part.getHeader("content-disposition");
        String[] items = contentDisposition.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}