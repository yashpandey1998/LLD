package com.app.bookMyShow.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Screen {
    int screenId;
    List<Seat> seats = new ArrayList<>();
}
