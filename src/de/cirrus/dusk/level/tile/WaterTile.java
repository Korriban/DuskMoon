package de.cirrus.dusk.level.tile;

import de.cirrus.dusk.gfx.Screen;
import de.cirrus.dusk.level.Level;

/**
 * DuskMoon
 * Copyright (C) 2014 by Cirrus
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * -
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * -
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * -
 * Contact: cirrus.contact@t-online.de
 */

public class WaterTile extends Tile {
    public WaterTile(int id) {
        super(id);
    }

    public void render(Screen screen, Level level, int x, int y) {
        super.render(screen, level, x, y);
    }

    public void update(Level level, int xt, int yt) {

    }
}
