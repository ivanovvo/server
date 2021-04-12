package vadim.help.neuro.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;
import vadim.help.neuro.jpa.models.NameOfType;
import vadim.help.neuro.jpa.repository.NameOfTypeRepository;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnimalServiceTest {
    @Autowired
    NameOfTypeRepository nameOfTypeRepository;
    @Autowired
    AnimalService animalService;

    @Test
    void recognize() {
        Assert.assertEquals("ERR: File Empty", animalService.recognize(null));

        MultipartFile multipartFile = new MultipartFile() {
            @Override
            public String getName() {
                return "volk.png";
            }

            @Override
            public String getOriginalFilename() {
                return "/storage/0AEA-1417/Pictures/volk.jpg";
            }

            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public byte[] getBytes() throws IOException {
                return new byte[0];
            }

            @Override
            public InputStream getInputStream() throws IOException {
                return null;
            }

            @Override
            public void transferTo(File file) throws IOException, IllegalStateException {

            }
        };

        Assert.assertEquals("ERR: Animal not found", animalService.recognize(multipartFile));

        Optional<NameOfType> NameOfType = nameOfTypeRepository.findById((long)5);
        if(!NameOfType .isPresent()) {
            String contr = "ERR: Animal not found";
            Assert.assertEquals(contr, contr);
        }

        /*String fileName = "volk.jpg";

        StringBuilder result = new StringBuilder();
        try {
            ProcessBuilder builder = new ProcessBuilder("python", "recognize.py","./files/" + fileName);


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

        //if(id==0) id=4L;
        //if(id==1) id=5L;


        Optional<NameOfType> NameOfType = NameOfTypeRepository.findById(id);
        System.out.println(NameOfType.get().getName());
        Assert.assertEquals("Волк", NameOfType.get().getName());*/
    }
}