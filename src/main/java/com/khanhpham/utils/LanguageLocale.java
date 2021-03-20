package com.khanhpham.utils;

/**
 * This enumeration have some language locale missing. Contribution for this is very necessary
 *
 * @author KhanhPham
 */

public enum LanguageLocale {
    ENGLISH("en_us"),
    VIETNAMESE("vi_vn");

    String locale;
    LanguageLocale(String locale) {
        this.locale = locale;
    }
}
