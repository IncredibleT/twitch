package com.peterwang.twitch.external.model;

import com.peterwang.twitch.external.model.Video;

import java.util.List;

public record VideoResponse(
        List<Video> data
) {
}
