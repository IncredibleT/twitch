package com.peterwang.twitch.external.model;

import com.peterwang.twitch.external.model.Game;

import java.util.List;

public record GameResponse(
        List<Game> data
) {
}
