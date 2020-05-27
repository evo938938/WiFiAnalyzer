/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2020 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.vrem.wifianalyzer.navigation.options

import com.vrem.wifianalyzer.R
import com.vrem.wifianalyzer.navigation.options.OptionAction.Companion.findOptionAction
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class OptionActionTest {
    @Test
    fun testOptionAction() {
        assertEquals(4, OptionAction.values().size)
    }

    @Test
    fun testGetKey() {
        assertEquals(-1, OptionAction.NO_ACTION.key)
        assertEquals(R.id.action_scanner, OptionAction.SCANNER.key)
        assertEquals(R.id.action_filter, OptionAction.FILTER.key)
        assertEquals(R.id.action_wifi_band, OptionAction.WIFI_BAND.key)
    }

    @Test
    fun testGetAction() {
        Assert.assertTrue(OptionAction.NO_ACTION.action == noAction)
        Assert.assertTrue(OptionAction.SCANNER.action == scannerAction)
        Assert.assertTrue(OptionAction.FILTER.action == filterAction)
        Assert.assertTrue(OptionAction.WIFI_BAND.action == wiFiBandAction)
    }

    @Test
    fun testGetOptionAction() {
        assertEquals(OptionAction.NO_ACTION, findOptionAction(OptionAction.NO_ACTION.key))
        assertEquals(OptionAction.SCANNER, findOptionAction(OptionAction.SCANNER.key))
        assertEquals(OptionAction.FILTER, findOptionAction(OptionAction.FILTER.key))
        assertEquals(OptionAction.WIFI_BAND, findOptionAction(OptionAction.WIFI_BAND.key))
    }

    @Test
    fun testGetOptionActionInvalidKey() {
        assertEquals(OptionAction.NO_ACTION, findOptionAction(-99))
        assertEquals(OptionAction.NO_ACTION, findOptionAction(99))
    }
}