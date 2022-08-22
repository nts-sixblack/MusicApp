package app.music.musicapp.service;

import app.music.musicapp.comman.Constant;
import app.music.musicapp.response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class YoutubeService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseObject searchVideoYoutube(String query) {
        ResponseEntity<ResponseObject> responseEntity = restTemplate.getForEntity(Constant.YT_API_URL+"/search?page=1&q="+query, ResponseObject.class);
        return responseEntity.getBody();
    }

    public ResponseObject streamVideoYoutube(String videoId) {
        ResponseEntity<ResponseObject> responseEntity = restTemplate.getForEntity(Constant.YT_API_URL+"/stream/"+videoId, ResponseObject.class);
        return responseEntity.getBody();
    }
}
