package vadim.help.neuro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import vadim.help.neuro.jpa.models.NameOfType;
import vadim.help.neuro.jpa.repository.NameOfTypeRepository;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    NameOfTypeRepository NameOfTypeRepository;

    public String recognize(MultipartFile file) {

        System.out.println(file);
        if (file == null || file.isEmpty()) {
            return "ERR: File Empty";
        }

        String fileName = file.getOriginalFilename().split("/" )[4];
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("./files/" + fileName);
            //Path path = Paths.get("C:/Users/vadim/Desktop/nero/ner/volk.png");
            Files.write(path, bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*StringBuilder result = new StringBuilder();
        try {
            ProcessBuilder builder = new ProcessBuilder("python", "recognize.py","./files/" + fileName);
            //ProcessBuilder builder = new ProcessBuilder("python", "recognize.py", "C:/Users/vadim/Desktop/nero/ner/volk.png");

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
        Long id = Long.valueOf(result.toString());*/

        Optional<NameOfType> NameOfType = NameOfTypeRepository.findById((long) 4);

        if(!NameOfType .isPresent()) return "ERR: Animal not found";
        return NameOfType.get().getName();

    }

}
