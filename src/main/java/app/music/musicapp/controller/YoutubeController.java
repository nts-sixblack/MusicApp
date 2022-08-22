package app.music.musicapp.controller;

import app.music.musicapp.comman.Constant;
import app.music.musicapp.response.ResponseObject;
import app.music.musicapp.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/youtube")
public class YoutubeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private YoutubeService youtubeService;

    @GetMapping("/search")
    public ResponseEntity<ResponseObject> searchYoutube(@RequestParam(name = "q") String query) {
        return ResponseEntity.status(HttpStatus.OK).body(
                youtubeService.searchVideoYoutube(query)
        );
    }

    @GetMapping("/stream/{videoId}")
    public ResponseEntity<ResponseObject> streamVideo(@PathVariable(name = "videoId") String videoId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                youtubeService.streamVideoYoutube(videoId)
        );
    }
}
