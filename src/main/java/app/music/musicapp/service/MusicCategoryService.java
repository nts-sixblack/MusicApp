package app.music.musicapp.service;

import app.music.musicapp.comman.Constant;
import app.music.musicapp.model.Fields;
import app.music.musicapp.model.MusicCategory;
import app.music.musicapp.model.Record;
import app.music.musicapp.response.CategoryResponse;
import app.music.musicapp.response.FieldResponse;
import app.music.musicapp.response.RecordResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicCategoryService {

    @Autowired
    private Gson gson;

    @Autowired
    private RestTemplate restTemplate;

    public CategoryResponse listMusicByCategoryId(String categoryId) {
        try {
            ResponseEntity<String> entity = restTemplate.getForEntity(Constant.BASE_URL+"/"+categoryId+"/1?api_key="+Constant.API_KEY, String.class);
            JsonObject jsonObject = new JsonParser().parse(entity.getBody().toString()).getAsJsonObject();
            MusicCategory musicCategory = gson.fromJson(jsonObject, MusicCategory.class);

            List<Record> recordList = musicCategory.getRecords();
            List<RecordResponse> recordResponseList = new ArrayList<RecordResponse>();
            for (Record record:recordList) {
                RecordResponse recordResponse = new RecordResponse();
                recordResponse.setId(record.getId());
                recordResponse.setCreatedTime(record.getCreatedTime());
                Fields fields = record.getFields();
                FieldResponse fieldResponse = new FieldResponse(
                        fields.getLuot_nghe(),
                        fields.getLuot_thich(),
                        fields.getThoi_gian(),
                        fields.getMusic_Title(),
                        fields.getMusic_Url(),
                        fields.getImage_Url(),
                        fields.getMusic_Size(),
                        fields.getComposed()
                );
                recordResponse.setFields(fieldResponse);
                recordResponseList.add(recordResponse);
            }

            CategoryResponse categoryResponse = new CategoryResponse();
            categoryResponse.setRecords(recordResponseList);

            return categoryResponse;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
