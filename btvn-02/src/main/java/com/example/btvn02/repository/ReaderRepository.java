package com.example.btvn02.repository;

import com.example.btvn02.entity.Reader;
import com.example.btvn02.model.request.ReaderCreationRequest;
import com.example.btvn02.statics.TypeOfReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReaderRepository {
    private static final List<Reader> readers = new ArrayList<>();
    private static int AUTO_ID = 1000;
    private final ObjectMapper objectMapper;

    static {
        for (int i = 0; i < 10; i++){
            Reader reader = Reader.builder()
            .id(AUTO_ID++)
            .name("Phạm Văn " + i)
            .dOb(LocalDate.ofEpochDay(i))
            .address(String.valueOf(i))
            .phoneNumber(i)
            .typeOfReader(TypeOfReader.GV)
                    .build();
            readers.add(reader);
        }

    }
    public List<Reader> getAll(){
        return readers;
    }
    public void delete(int id){
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getId() == id){
                readers.remove(i);
                return;
            }
        }
    }
    public void createReader(ReaderCreationRequest readerCreationRequest){
        Reader reader = Reader.builder()
                .id(AUTO_ID++)
                .name(readerCreationRequest.getName())
                .dOb(readerCreationRequest.getDOb())
                .address(readerCreationRequest.getAddress())
                .phoneNumber(readerCreationRequest.getPhoneNumber())
                .build();
        readers.add(reader);
    }
}

