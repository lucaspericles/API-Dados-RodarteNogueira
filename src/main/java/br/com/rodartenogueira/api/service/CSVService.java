package br.com.rodartenogueira.api.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import br.com.rodartenogueira.api.importfile.CSVHelper;
import br.com.rodartenogueira.api.model.AlunoModel;
import br.com.rodartenogueira.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
    @Autowired
    AlunoRepository alunoRepository;

    public void save(MultipartFile file) {
        try {
            List<AlunoModel> alunoModels = CSVHelper.csvToTutorials(file.getInputStream());
            alunoRepository.saveAll(alunoModels);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public ByteArrayInputStream load() {
        List<AlunoModel> alunoModels = alunoRepository.findAll();

        ByteArrayInputStream in = CSVHelper.tutorialsToCSV(alunoModels);
        return in;
    }

    public List<AlunoModel> getAllTutorials() {
        return alunoRepository.findAll();
    }
}