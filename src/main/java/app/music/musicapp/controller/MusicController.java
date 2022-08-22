package app.music.musicapp.controller;

import app.music.musicapp.response.CategoryResponse;
import app.music.musicapp.service.MusicCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicCategoryService musicCategoryService;

    @GetMapping("/{categoryId}")
    public ResponseEntity<CategoryResponse> listMusicByCategory(@PathVariable String categoryId) {
        CategoryResponse categoryResponse = musicCategoryService.listMusicByCategoryId(categoryId);
        if (categoryResponse == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    null
            );
        }
        return ResponseEntity.status(HttpStatus.OK).body(
                categoryResponse
        );
    }



}
