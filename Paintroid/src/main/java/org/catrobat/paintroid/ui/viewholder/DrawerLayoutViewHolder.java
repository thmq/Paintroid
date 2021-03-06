/*
 * Paintroid: An image manipulation application for Android.
 * Copyright (C) 2010-2015 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catrobat.paintroid.ui.viewholder;

import android.support.v4.widget.DrawerLayout;

import org.catrobat.paintroid.contract.MainActivityContracts;

public class DrawerLayoutViewHolder implements MainActivityContracts.DrawerLayoutViewHolder {
	public final DrawerLayout drawerLayout;

	public DrawerLayoutViewHolder(DrawerLayout drawerLayout) {
		this.drawerLayout = drawerLayout;
	}

	@Override
	public void closeDrawer(int gravity, boolean animate) {
		drawerLayout.closeDrawer(gravity, animate);
	}

	@Override
	public boolean isDrawerOpen(int gravity) {
		return drawerLayout.isDrawerOpen(gravity);
	}

	@Override
	public void openDrawer(int gravity) {
		drawerLayout.openDrawer(gravity);
	}
}
