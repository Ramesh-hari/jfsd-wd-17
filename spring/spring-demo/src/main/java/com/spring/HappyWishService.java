package com.spring;

public class HappyWishService implements WishService {
    @Override
    public String getWish() {
        return "Good luck for the match";
    }
}
