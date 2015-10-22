package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.DatePlannerRequest;
import nl.han.dateplanner.DatePlannerResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.converter.jaxb.JaxbDataFormat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatePlannerCachingService {

    private final String CACHED_DIR = "C:\\camel_route_storage";

    public DatePlannerCachingService() {

    }

    public boolean IsCached(DatePlannerRequest request) {
        return GetCached(request) != null;
    }

    public String GetCached(DatePlannerRequest request) {
        for (String name : Files()) {
            String contents = ReadFile(name);
            if (contents != null) {
                boolean location = (contents.contains("<location>"+ request.getInput().getLocation() + "</location>"));
                boolean radius = (contents.contains("<radius>"+ request.getInput().getRadius() + "</radius>"));
                boolean dayPart = (contents.contains("<dayPart>"+ request.getInput().getDayPart() + "</dayPart>"));
                boolean types = (contents.contains("<types>"+ request.getInput().getTypes() + "</types>"));

                if (location && radius && dayPart && types)
                    return contents;
            }
        }
        return null;
    }

    private List<String> Files() {
        List<String> results = new ArrayList<String>();

        File[] files = new File(CACHED_DIR).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }
        return results;
    }

    private String ReadFile(String fileName) {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                return sb.toString();
            }
        } catch (IOException e) {
            // should already be done with the try with, but we need this otherwise it won't build?
        }
        return null;
    }
}
