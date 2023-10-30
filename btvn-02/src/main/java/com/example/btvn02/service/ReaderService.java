package com.example.btvn02.service;

import com.example.btvn02.entity.Reader;
import com.example.btvn02.model.request.ReaderCreationRequest;
import com.example.btvn02.repository.ReaderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReaderService {
private final ReaderRepository readerRepository;
public List<Reader> getAll(){
    return readerRepository.getAll();
}
public void deleteReader(int id){
    readerRepository.delete(id);
}
public void createReader(ReaderCreationRequest readerCreationRequest){
    readerRepository.createReader(readerCreationRequest);
}
}
