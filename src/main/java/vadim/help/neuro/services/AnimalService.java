package vadim.help.neuro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import vadim.help.neuro.jpa.models.Animal;
import vadim.help.neuro.jpa.repository.AnimalRepository;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public String recognize(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            return "ERR: File Empty";
        }
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("./files/" + file.getOriginalFilename());
            Files.write(path, bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder result = new StringBuilder();
        try {
            ProcessBuilder builder = new ProcessBuilder("python", "recognize.py", "./files/" + file.getOriginalFilename());
            builder.redirectErrorStream(true);
            Process process = builder.start();
            InputStream is = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LONG : "+Long.valueOf(result.toString()));
        Long id = Long.valueOf(result.toString());

        if(id==0) id=4L;
        if(id==1) id=5L;


        Optional<Animal> animal = animalRepository.findById(id);

        if(!animal.isPresent()) return "ERR: Animal not found";
        return animal.get().getName();

    }

}
