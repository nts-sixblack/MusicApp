package app.music.musicapp.retrofit;

import app.music.musicapp.comman.Constant;

public class APIService {
    public static MainApi getService() {
        return APIRetrofitClient.getClient(Constant.BASE_URL).create(MainApi.class);
    }
}
