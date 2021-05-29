/*
 * This file is part of Doodle Android.
 *
 * Doodle Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Doodle Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Doodle Android. If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (c) 2020-2021 by Patrick Zedler
 */

package xyz.zedler.patrick.doodle;

public final class Constants {

  public final static class PREF {

    public final static String NIGHT_MODE = "night_mode";
    public final static String FOLLOW_SYSTEM = "follow_system";
    public final static String ZOOM = "zoom";
    public final static String ZOOM_LAUNCHER = "zoom_launcher";
    public final static String ZOOM_UNLOCK = "zoom_unlock";
    public final static String WALLPAPER = "wallpaper";
    public final static String VARIANT = "variant";
    public final static String PARALLAX = "parallax";
    public final static String SCALE = "size";

    public final static String SETTINGS_APPLIED = "settings_applied";
    public final static String THEME_APPLIED = "theme_applied";

    public final static String LAST_VERSION = "last_version";
    public final static String FEEDBACK_POP_UP_COUNT = "feedback_pop_up_count";
  }

  public final static class DEF {

    public final static boolean NIGHT_MODE = true;
    public final static boolean FOLLOW_SYSTEM = true;
    public final static int ZOOM = 3;
    public final static boolean ZOOM_LAUNCHER = true;
    public final static boolean ZOOM_UNLOCK = true;
    public final static String WALLPAPER = Constants.WALLPAPER.PIXEL;
    public final static String VARIANT = Constants.VARIANT.BLACK;
    public final static int PARALLAX = 1;
    public final static float SCALE = 1;
  }

  public final static class WALLPAPER {

    public final static String PIXEL = "pixel";
    public final static String JOHANNA = "johanna";
    public final static String REIKO = "neon";
    public final static String ANTHONY = "geometric";
  }

  public final static class VARIANT {

    public final static String BLACK = "black";
    public final static String WHITE = "white";
    public final static String ORANGE = "orange";
  }

  public final static class EXTRA {

    public final static String TITLE = "title";
    public final static String LINK = "link";
    public final static String FILE = "file";
  }

  public final static class USER_PRESENCE {

    public final static String LOCKED = "locked";
    public final static String OFF = "off";
    public final static String UNLOCKED = "unlocked";
  }
}
