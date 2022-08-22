package app.music.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String id;
    private String title;
    private String thumbnail;
    private  String lengthTextSimpleText;
    private  int viewCountText;
    private String publishedTimeText;
    private String ownerChannelText;
    private String thumbnailChannel;
}
