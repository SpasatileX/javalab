import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SerializeToTxt implements Serialize<Animal> {
    @Override
    public void writeToFile(List<Animal> objs, String fileName) throws IOException
    {
        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);
        CsvSchema schema = mapper.schemaFor(Animal.class).withHeader();;
        ObjectWriter writer = mapper.writerFor(Animal.class).with(schema);
        writer.writeValues(new File(fileName)).writeAll(objs);
    }

    @Override
    public List<Animal> readFromFile(String fileName) throws IOException
    {
        //створили маппер для конфігурації інформації
        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);
        //створили схему нашого класу
        CsvSchema schema = mapper.schemaFor(Animal.class).withHeader();
        //створили рідер та передали конфігурацію з маппера
        ObjectReader reader = mapper.readerFor(Animal.class).with(schema);
        //зчитали інформацію з файлу
        return (List)reader.readValues(new File(fileName)).readAll();
    }
}
