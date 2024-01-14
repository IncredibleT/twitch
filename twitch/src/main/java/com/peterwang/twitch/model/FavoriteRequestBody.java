package com.peterwang.twitch.model;

import com.peterwang.twitch.db.entity.ItemEntity;

public record FavoriteRequestBody(
        ItemEntity favorite
) {
}
