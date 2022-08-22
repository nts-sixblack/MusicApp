package app.music.musicapp.retrofit;

import app.music.musicapp.model.MusicCategory;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi {

    @GET("app0hEtQ8jNQVUOdq/1?")
    Call<MusicCategory> get(@Query("api_key") String api_key);

//    @GET("{id_category}/1?")
//    Call<MusicCategory> GetMusicByCategory(@Path("id_category") String id_category, @Query("api_key") String api_key);
}
