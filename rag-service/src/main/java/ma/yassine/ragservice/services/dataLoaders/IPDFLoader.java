package ma.yassine.ragservice.services.dataLoaders;

import org.springframework.core.io.Resource;

public interface IPDFLoader {
    void loadPDF(Resource pdfResource);
}
