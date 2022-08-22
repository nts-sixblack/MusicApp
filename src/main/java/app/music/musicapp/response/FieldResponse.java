package app.music.musicapp.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldResponse {
    private String listeningFrequency;
    private String LikeFrequency;
    private String time;
    private String Music_Url;
    private String Image_Url;
    private String Music_Size;
    private String Composed;
}
