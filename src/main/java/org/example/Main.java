package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path resource = Paths.get("E:\\Coding\\testMaven\\resource.json");
        Path bookspath = Paths.get("E:\\Coding\\testMaven\\books.json");
        Path itemspath = Paths.get("E:\\Coding\\InventoryManagementSystem\\inventory.json");

        List<Colors> colorsList = new ObjectMapper().readValue(resource.toFile(), new TypeReference<List<Colors>>() {});
        for(int i=0; i<colorsList.size(); i++){
            System.out.println( colorsList.get(i).toString());
        }
        List<Book> booksList = new ObjectMapper().readValue(bookspath.toFile(), new TypeReference<List<Book>>() {});
        for(int i=0; i<booksList.size(); i++){
            System.out.println( booksList.get(i).toString());
        }
        List<Item> itemList = new ObjectMapper().readValue(itemspath.toFile(), new TypeReference<List<Item>>() {});
        for(int i=0; i<itemList.size(); i++){
            System.out.println( itemList.get(i).toString());
        }
        }
    }


