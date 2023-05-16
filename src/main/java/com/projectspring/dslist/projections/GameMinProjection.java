package com.projectspring.dslist.projections;

public interface GameMinProjection {

    Long getId();

    String getTitle();

    int getGameYear();

    String getImgUrl();

    String getShortDescription();

    int getPosition();
}
