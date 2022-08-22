package app.music.musicapp.controller;

import app.music.musicapp.comman.Constant;
import app.music.musicapp.model.Fields;
import app.music.musicapp.model.MusicCategory;
import app.music.musicapp.retrofit.APIService;
import app.music.musicapp.retrofit.MainApi;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@RestController
public class HomeController {

    @GetMapping("/category")
    public MusicCategory index() {
        MainApi mainApi = APIService.getService();
        Call<MusicCategory> call = mainApi.get("keyjd4mHxykM7LHvW");
        final MusicCategory[] musicCategory = {new MusicCategory()};
        call.enqueue(new Callback<MusicCategory>() {
            @Override
            public void onResponse(Call<MusicCategory> call, Response<MusicCategory> response) {
                musicCategory[0] = response.body();
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<MusicCategory> call, Throwable throwable) {

            }
        });
        return musicCategory[0];
    }

    @GetMapping("/")
    public MusicCategory homde() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(Constant.BASE_URL+"/app0hEtQ8jNQVUOdq/1?api_key="+Constant.API_KEY, String.class);
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonParser().parse(entity.getBody().toString()).getAsJsonObject();
        MusicCategory musicCategory = gson.fromJson(jsonObject, MusicCategory.class);
        return musicCategory;
    }

}
