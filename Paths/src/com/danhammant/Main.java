package com.danhammant;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {

//           Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//           Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//           Files.createDirectories(dirToCreate);
//           Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//           Files.createFile(fileToCreate);
//           Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//           Files.createDirectory(dirToCreate);
//           Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//           Files.deleteIfExists(fileToDelete);
            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Last modified =" + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("Is directory = " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile() );


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
////        Path filepath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filepath = Paths.get(".","files","SubdirectoryFile.txt");
//        printFile(filepath);
//
//        filepath = Paths.get("D:\\Code\\IdeaProjects\\Java Masterclass Projects\\OutThere.txt");
//        printFile(filepath);
//
//        filepath = Paths.get(".");
//        System.out.println(filepath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("G:\\","test","nothinghere.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filepath = FileSystems.getDefault().getPath("files");
//        System.out.println("File exists = " + Files.exists(filepath));
//
//        System.out.println("File exists = " + Files.exists(path4));
//    }
//
//    private static void printFile(Path path) {
//        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
